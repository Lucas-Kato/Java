public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São mesma conta");
        } else {
            System.out.println("Não são mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

