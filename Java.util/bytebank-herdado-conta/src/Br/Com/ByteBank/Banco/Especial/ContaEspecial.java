package Br.Com.ByteBank.Banco.Especial;

import Br.Com.ByteBank.Banco.Modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
        
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        
    }
    
}
