public class TestaCondicional {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando Condicionais");

        int idade = 20;
        int quantidadeDePessoa = 3;

        if(idade >= 18) {
            System.out.println("Você tem mais que 18.");
            System.out.println("Seja bem vindo!");
        } else {
            if(quantidadeDePessoa >= 2){
                System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado.");
            } else {
                System.out.println("infelizmente você não pode entrar.");
            }
            System.out.println();
        }
    }
}
