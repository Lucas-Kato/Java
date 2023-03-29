package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
