package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
    
        // OutputStream fos = new FileOutputStream("lorem.txt");
        // Writer osw = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(osw);
        //FileWriter fw = new FileWriter("lorem2.txt");
        // BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");

        //PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        ps.println();
        ps.println();
        ps.println();
        ps.println("id est laborum.");

        ps.close();

        System.out.println();
    }
}
