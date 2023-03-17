package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.Conta;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;
import Br.Com.ByteBank.Banco.Modelo.GuardadorDeReferencia;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencia guardador = new GuardadorDeReferencia();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(33, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta)guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }

}
