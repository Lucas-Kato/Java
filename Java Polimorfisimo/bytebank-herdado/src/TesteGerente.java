public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Matheus");
        g1.setCpf("999999-99");
        g1.setSalario(5000.0);

        Gerente g2 = new Gerente();
        g2.setSenha(11111);
        g2.setCpf("88888888-88");
        g2.setNome("Renato");
        g2.setSalario(20000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
        
    }
}
