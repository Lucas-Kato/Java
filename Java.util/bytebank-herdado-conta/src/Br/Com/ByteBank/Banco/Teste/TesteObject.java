package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.Cliente;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;
import Br.Com.ByteBank.Banco.Modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        
        // System.out.println("x");
        // System.out.println(3);
        // System.out.println(false);

        Object cc = new ContaCorrente(123, 33333);
        Object cp = new ContaPoupanca(321, 11111);
        Object cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        //println(cliente);
    }

    static void println() {

    }
    static void println(int a) {

    }
    static void println(boolean valor) {

    }
    static void println(ContaCorrente  conta) {

    }
}
