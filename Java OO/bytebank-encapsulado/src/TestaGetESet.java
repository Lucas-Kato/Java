public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta =new Conta(1337, 24555);
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        cliente paulo = new cliente();
        //conta.titular = paulo;
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        System.out.println(paulo);
        System.out.println(conta.getTitular());

    }
}
