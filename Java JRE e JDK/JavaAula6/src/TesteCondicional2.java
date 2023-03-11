public class TesteCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicional");

        int idade = 16;
        int quantidadeDePessoa = 3;
        boolean acompanhado = quantidadeDePessoa >= 2;

        if(idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}
