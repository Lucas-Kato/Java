package Br.Com.ByteBank.Banco.Teste.Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Br.Com.ByteBank.Banco.Modelo.Conta;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteArryList {
    public static void main(String[] args) {
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>(); // usa array por baixo
        List<Conta> list = new LinkedList<Conta>(); // lista linkada
        List<Conta> list2 = new Vector<Conta>(); // usa array por baixo . mas também é thredsafe 
        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(33, 22);
        lista.add(cc2);

         System.out.println("Tamanho: " + lista.size());
         Conta ref = lista.get(0);
         System.out.println(ref.getNumero());

         lista.remove(0);

         System.out.println("Tamanho: " + lista.size());

         Conta cc3 = new ContaCorrente(44, 114);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(55, 223);
        lista.add(cc4);

        for(int i = 0 ; i < lista.size() ; i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-   -   -   -   -   -   -   -   -   -   -   -");

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
