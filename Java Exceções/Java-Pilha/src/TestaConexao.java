public class TestaConexao {
    //metodo novo
    public static void main(String[] args) {

        try(Conexao conexao = new Conexao() ) {
            conexao.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }





//-------------------------------------------------------------------

//Metodo antigo
        // Conexao con = null;
        
        // try {
        //     con = new Conexao();
        //     con.leDados();
        // } catch (Exception e) {
        //     System.out.println("Deu erro na conexão");
        // } finally {
        //     System.out.println("Finally");
        //     if(con != null){
        //         con.close();
        //     }
        // }
    }
}
