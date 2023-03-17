package Br.Com.ByteBank.Banco.Teste.Util;

import java.util.ArrayList;

import Br.Com.ByteBank.Banco.Modelo.Conta;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteArryListEquals {
    public static void main(String[] args) {

        // Conta cc1 = new ContaCorrente(22, 11);
        // Conta cc2 = new ContaCorrente(22, 11);

        // boolean igual = cc1.ehIgual(cc2);
        // System.out.println(igual);
        
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(33, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(33,  22);

        boolean existe = lista.contains(cc3);

        System.out.println("Já existe?: " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
