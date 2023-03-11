
public class TesteFuncionario {
    public static void main(String[] args) {
        
        Gerente gh = new Gerente();
        gh.setNome("Ghabriel");
        gh.setCpf("99999999-99");
        gh.setSalario(2600.00);

        System.out.println(gh.getNome());
        System.out.println(gh.getCpf());
        System.out.println(gh.getBonificacao());
    }
}
