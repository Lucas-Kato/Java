package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.*;

/**
 * Classe que representa um Cliente no Bytebank
 * 
 * @author Kato
 * @version 0.1
 * 
 */

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
