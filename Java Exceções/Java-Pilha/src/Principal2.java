public class Principal2 {
    public static void main(String[] args) {
        String nome = "Alura";
        System.out.println("Antes");

        try {
            System.out.println(nome);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("CATCH");
        }
        System.out.println("Depois");
    }
}
