public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoBob = new Conta();
        contaDoBob.saldo = 100;
        contaDoBob.deposita(50);
        System.out.println(contaDoBob.saldo);

        boolean retirada = contaDoBob.saca(20);
        System.out.println(contaDoBob.saldo);
        System.out.println(retirada);

        Conta contaDaGabi = new Conta();
        contaDaGabi.deposita(1000);

        if(contaDaGabi.transfere(3000, contaDoBob)) {
            System.out.println("Transferência foi realizada com sucesso");
        } else {
            System.out.println("Transferencia não realizada.");
        }
        System.out.println(contaDaGabi.saldo);
        System.out.println(contaDoBob.saldo);

        contaDoBob.titular = "Roberto Carlos";
        System.out.println(contaDoBob.titular);
    }
}
