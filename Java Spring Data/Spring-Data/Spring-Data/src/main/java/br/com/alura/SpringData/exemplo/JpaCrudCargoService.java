package br.com.alura.SpringData.exemplo;

import br.com.alura.SpringData.orm.Cargo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaCrudCargoService {
    private EntityManagerFactory emf;
    private EntityManager em;

    public void JpaExemplo() {
        emf = Persistence.createEntityManagerFactory("jpa");
        em = emf.createEntityManager();
    }

    public void save(Cargo cargo) {
        em.getTransaction().begin();
        em.persist(cargo);
        em.getTransaction().commit();
        em.close();
    }

    public Cargo findById(Integer id) {
        em.getTransaction().begin();
        Cargo cargo = em.find(Cargo.class, id);
        em.getTransaction().commit();
        em.close();
        return cargo;
    }

    public void deleteById(Integer id) {
        Cargo cargo = em.find(Cargo.class, id);

        em.getTransaction().begin();
        em.remove(cargo);
        em.getTransaction().commit();
    }

}
