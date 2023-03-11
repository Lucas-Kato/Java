public class TestaBanco {
    public static void main(String[] args) {
        cliente paulo = new cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        // associa o cliente paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
    }
}
