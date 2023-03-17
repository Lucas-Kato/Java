package Br.Com.ByteBank.Banco.Teste;

public class TesteArryDePrimitivos {
    //Array []
    public static void main(String[] args) {

        int[] idades = new int[5]; //inicializa o array com os valores padroes = 0;

        for(int i = 0 ; i < idades.length ; i++ ) {
            idades[i] = i * i;
        }
        for(int i = 0 ; i < idades.length ; i++) {
            System.out.println(idades[i]);
        }
    }

}
