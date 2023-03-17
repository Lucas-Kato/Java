package Br.Com.ByteBank.Banco.Modelo;

public class GuardadorDeReferencia {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencia(){
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
