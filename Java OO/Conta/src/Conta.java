public class Conta {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    public void deposita(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular("Roberto Carlos");
        conta.deposita(100000);

        double valorSaque = 1000;
        conta.saca(valorSaque);

        double valorDeposita = 100000;
        conta.deposita(valorDeposita);
        }
    
    
}
