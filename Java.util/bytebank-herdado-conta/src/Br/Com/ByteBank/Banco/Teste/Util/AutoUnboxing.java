package Br.Com.ByteBank.Banco.Teste.Util;

public class AutoUnboxing {
    public static void main(String[] args) {
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

        //Correto, realmente incrementa o valor inteiro, mesmo sendo uma referência. O que acontece por baixo dos panos é um autoboxing / unboxing na linha que incrementa a variável (ref++). Você pode imaginar que essa linha será substituída por três novas:
        // int valor = ref.intValue();
        // valor = valor + 1;
        // ref = Integer.valueOf(valor);
        //O valor é desembrulhado, depois incrementado e depois embrulhado de novo!
    }
}
