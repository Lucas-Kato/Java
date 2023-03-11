public class TesteSacaValorNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.getSaldo());

        //proibido:
        // conta.saldo = conta.saldo - 101;
        // System.out.println(conta.saldo);
    }
}
