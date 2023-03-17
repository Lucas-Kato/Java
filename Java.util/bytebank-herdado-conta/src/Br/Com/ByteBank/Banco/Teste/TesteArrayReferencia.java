package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.Cliente;
import Br.Com.ByteBank.Banco.Modelo.Conta;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;
import Br.Com.ByteBank.Banco.Modelo.ContaPoupanca;

public class TesteArrayReferencia {
    public static void main(String[] args) {
        //int[] idades = new int[5];
        Object[] referencias = new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);

        referencias[0] = cc1;
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //System.out.println(cc2.getNumero());

        // Object refereciaGenerecia = contas[1];
        // System.out.println(contas[1].getNumero());

         ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
         System.out.println(cc2.getNumero());
         System.out.println(ref.getNumero());

         ContaPoupanca[] contas1 = new ContaPoupanca[10];
         ContaPoupanca cp1 = new ContaPoupanca(11, 22);
         ContaPoupanca cp2 = new ContaPoupanca(33, 44);

         contas1[0] = cp1;
         contas1[1] = cp1;
         contas1[2] = cp2;
         contas1[3] = cp2;

         ContaPoupanca ref1 = contas1[1];
         ContaPoupanca ref2 = contas1[4];
         System.out.println(ref1);
         System.out.println(ref2);
    }
}
