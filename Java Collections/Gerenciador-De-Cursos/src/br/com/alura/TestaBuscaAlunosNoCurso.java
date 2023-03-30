package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        //5617 é o aluno Guilherme Silveira
        //34672 é aluno xxxxx

        Aluno a1 = new Aluno("Rodrigo Torini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Maruricio Aniche", 17645);
        Aluno a4 = new Aluno("Mateus Vieira", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matricula 5617?");

         Aluno aluno = javaColecoes.buscaMatriculado(17645);
         System.out.println("Aluno: " + aluno);

         Map<Integer, Set<Aluno>> MatriculaParaAlunos;
    }
}
