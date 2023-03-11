public class Conta {
         private double saldo;
         private int agencia;
         private int numero;
         private cliente titular;
         private static int total;
    
         public Conta(int agencia, int numero){
            Conta.total++;
            System.out.println("O total de contas criadas é " + Conta.total);

            this.agencia = agencia;
            this.numero = numero;
            System.out.println("Estou criando uma conta: " + this.numero);
            System.out.println("Está criando em uma agencia: " + this.agencia);
         }

        public void deposita(double valor) {
            this.saldo += valor;
        }
    
        public boolean saca(double valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
                 return true;
            } else {
                return false;
            }
        }
    
        public boolean transfere(double valor, Conta destino){

            if(this.saldo >= valor){
                this.saldo -= valor;
                destino.deposita(valor);
                return true;
            }
                return false;
        }

        public double getSaldo() {
            return this.saldo;
        }

        public int getNumero(){
            return this.numero;
        }

        public void setNumero(int numero){
            if(numero <= 0){
                System.out.println("Não pode valor menor igual a zero");
                return;
            }
            this.numero = numero;
        }

        public int getAgencia() {
            return agencia;
        }

        public void setAgencia(int agencia) {
            if(agencia <= 0){
                System.out.println("Não pode valor menor igual a zero");
                return;
            }
            this.agencia = agencia;
        }

        public cliente getTitular() {
            return titular;
        }

        public void setTitular(cliente titular) {
            this.titular = titular;
        }

        public static int getTotal(){
            return Conta.total;
        }

    }        
