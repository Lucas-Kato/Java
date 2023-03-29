package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TesteAlunosSemAcentos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Mateus");
        alunos.add("Thiago");
        alunos.add("Kato");

        System.out.println(alunos.size());

        alunos.add("Ana");

        System.out.println(alunos.size());

        boolean adicionou = alunos.add("Luiz");
        System.out.println("Luiz foi adicionado ao Set? " + adicionou);
    }
}
