package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.Conta;
import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;
import Br.Com.ByteBank.Banco.Modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(33, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getNumero());
        
    }
}
