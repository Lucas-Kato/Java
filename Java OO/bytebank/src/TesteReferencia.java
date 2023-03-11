public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundConta.saldo);

        segundConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundConta.saldo);

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        if(primeiraConta == segundConta){
            System.out.println("São mesma conta");
        } else {
            System.out.println("Não são mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundConta);
    }
}
