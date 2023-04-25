package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;


import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDao {
    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria){
        this.em.persist(categoria);
    }
    public void alterar(Categoria categoria) {
        this.em.merge(categoria);
    }

    public  void remover(Categoria categoria) {
        categoria = em.merge(categoria);
        this.em.remove(categoria);
    }

    public Categoria buscarPorId(Long id) {
        return em.find(Categoria.class, id);
    }

    public List<Categoria> buscarTodos() {
        String jpql = "SELECT p FROM Produto p";
        return em.createQuery(jpql, Categoria.class).getResultList();
    }

    public List<Categoria> buscarPorNome(String nome) {
        String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(jpql, Categoria.class).setParameter("nome", nome).getResultList();
    }
}
