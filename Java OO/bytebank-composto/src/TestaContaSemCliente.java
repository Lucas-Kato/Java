public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaGabi = new Conta();
        System.out.println(contaDaGabi.getSaldo());

        contaDaGabi.titular = new cliente();
        System.out.println(contaDaGabi.titular);

        contaDaGabi.titular.nome = "Gabriela";
        System.out.println(contaDaGabi.titular.nome);
    }
}
