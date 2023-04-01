import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate academiaJava = LocalDate.of(2023 , Month.APRIL, 3);
        int anos = academiaJava.getDayOfYear() - hoje.getDayOfYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, academiaJava);
        System.out.println(periodo.getDays());

        LocalDate proximaAcademia = academiaJava.plusYears(4);
        System.out.println(proximaAcademia);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh::mm");

        String valorFormatado = proximaAcademia.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(14, 00);
        System.out.println(intervalo);

        LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(futuro);

        LocalDate agora2 = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        Period periodo2 = Period.between(agora2, dataFutura);
        System.out.println(periodo2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataformatada = formatter.format(agora2);
        System.out.println(dataformatada);


    }
}
