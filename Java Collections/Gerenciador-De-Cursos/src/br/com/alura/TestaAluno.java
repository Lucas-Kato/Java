package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
    public static void main(String[] args) {
        /*
         * Usado para busca de dados; hashSet é mais rápido do que List;
         */
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");

        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);
        
    }
    
}
