package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while( scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(" , ");
            
            String TipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format("%s - %4d-%07d, %s: %08.2f", TipoConta, agencia, numero, titular, saldo); // formatação de valor
            System.out.println(valorFormatado);
            

            linhaScanner.close();
            
            // String[] valores = linha.split(" , ");
            // System.out.println(valores[3]);

        }
        
        scanner.close();
    }
}
