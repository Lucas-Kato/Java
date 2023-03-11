//Gerente é um Funcionário, Gerente herda da class FuncionárioAutenticavel / Class Filho. assina o contrato autenticavel e autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public boolean autentica(int senha) {
         return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);;
    }
    
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do Gerente");
        return super.getSalario();
    }
    
}
    
