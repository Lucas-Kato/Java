public class AliquotaComIfs {
    public static void main(String[] args) {    
        double salario = 4664.0;

        if(salario >= 1900 && salario <= 2800){
            System.out.println("O IR é de 7.5%");
            System.out.println("Pode deduzir na declaração o valor de R$ 142.");
            }
            if(salario >= 2800.01 && salario <= 3750) {
                System.out.println("O IR é de 15%.");
                System.out.println("Pode deduzir R$ 350.");
        }
        if(salario >= 3751.01 && salario <= 4664.00){
            System.out.println("O IR é de 22.5%.");
            System.out.println("Pode deduzir R$636.");
        }
    }
}
