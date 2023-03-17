package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;
import Br.Com.ByteBank.Banco.Modelo.ContaPoupanca;
import Br.Com.ByteBank.Banco.Modelo.SacaException;

//Br.Com.ByteBank.Banco.Teste.TesteContas
public class TesteContas {

    //java.lang.String
    public static void main(String[] args) throws SacaException{

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10, cp);

        //java.lang.System
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
