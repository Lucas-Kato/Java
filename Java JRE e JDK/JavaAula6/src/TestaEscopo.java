public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicional");

        int idade = 20;
        int quantidadeDePessoas = 3;
        boolean acompanhado = true;

        if(quantidadeDePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        if(idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
