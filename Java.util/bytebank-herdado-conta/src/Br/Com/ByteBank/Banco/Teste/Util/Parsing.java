package Br.Com.ByteBank.Banco.Teste.Util;

public class Parsing {
    public static void main(String[] args) {
        String diaComoTexto = "29";
        int dia = Integer.parseInt(diaComoTexto);//seria a opção mais adequada pois devolve um primitivo.
        //int dia = Interger.valueOF(diaComoTexto); // mas não seria a melhor opção pois devolve uma referência (e ai é feito um unboxing).
        System.out.println(dia);
    }
}
