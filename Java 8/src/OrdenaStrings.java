import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora casa do codigo");
        palavras.add("Caelum");

        // Collections.sort(palavras, comparador);
        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        Function<String, Integer> funcao = new Function<String,Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
            
        };
        Function<String, Integer> funcao2 = String::length;
        Function<String, Integer> funcao3 = s -> s.length();


        Comparator<String> comparador = Comparator.comparing(s -> s.length());
        palavras.sort(comparador);

        System.out.println(palavras);

        // for (String p : palavras) {
        // System.out.println(p);
        // }

        Consumer<String> impressor = System.out::println;
        Consumer<String> impressor2 = s -> System.out.println(s);
        palavras.forEach(impressor);

        palavras.forEach(s -> System.out.println(s));
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}
