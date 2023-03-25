package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListas2 {
    public static void main(String[] args) {
        
        String curso1 = "Java 8: Tire proveito dos novos recursos";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer 1";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        /*
         *  O método size retorna o total de elemtentos. Como estamos acessando até i <= cursos.size() temos um problema.
         * Uma exception do tipo IndexOutOfBoundsException  é lançada.
         */
        for(int i = 0; i <= cursos.size(); i++) {
            System.out.println("Aula: " + cursos.get(i));
        }

        cursos.remove(1);
        cursos.get(0);
        System.out.println("O primeiro curso da lista é o: " + cursos.get(0));

        System.out.println(cursos);

        Collections.sort(cursos);
        System.out.println("Depois de alterar ordem: " + cursos);
    }
}
