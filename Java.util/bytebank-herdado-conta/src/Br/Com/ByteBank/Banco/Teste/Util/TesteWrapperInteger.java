package Br.Com.ByteBank.Banco.Teste.Util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29; // Integer

        Integer idadeRef = Integer.valueOf(29);// autoboxing, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); //Unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); // ok
        lista.add(primitivo); // autoboxing

        int i1 = lista.get(0); // unboxing
        Integer i2 = lista.get(1); // ok

        System.out.println(i1);// 29
        System.out.println(i2); // 21
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); // unboxing

        //String s = args[0]; //"10"

        //Integer numero = Integer.valueOf(s);
        //int numero = Integer.parseInt(s);
        //System.out.println(numero);
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing

        Integer valorRef = Integer.valueOf(33); //delegando a criação para método valueOf
        int valorPri = valorRef.intValue(); // desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPri);

        Integer iParseado1 = Integer.valueOf("42"); // parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo

        System.out.println(iParseado1);
        System.out.println(iParseado2);

        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
    
    

}
