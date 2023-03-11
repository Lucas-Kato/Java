//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SacaException{
        double valorAsacar = valor + 0.2;
        super.saca(valorAsacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
