package Br.Com.ByteBank.Banco.Teste;

public class TesteString {
    public static void main(String[] args) {

        String vazio = "   Alura   ";
        String outroVazio = vazio.trim();
        System.out.println(outroVazio);
        System.out.println(vazio.contains("Alu"));
        
        String nome = "Alura"; // object literal
        //String outro =  new String("Alura");    // mau uso

        System.out.println(nome.length());
        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        int  pos = nome.indexOf("ur", 0);
        System.out.println(pos);

        String sub = nome.substring(1, 4);
        System.out.println(sub);

        char c = nome.charAt(2);
        System.out.println(c);

        char ca = 'A';
        char d = 'a';

        String outro = nome.replace(ca , d);

        String outra = nome.toUpperCase();

        System.out.println(nome);
        System.out.println(outra);

        String nome1 = "Mario";
        nome.replace('o', 'a');
        System.out.println(nome1);
        
    }
}
