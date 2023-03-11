public class Carro {
    private int ano;
    private String modelo;
    private double preco;

    public Carro(int ano, String modelo, double preco){
        if(ano >= 1891){
            this.ano = ano;
        } else {
            System.out.println("O ano informando está inválido. Por isso usaremos 2017");
            this.modelo = "supra";
        }
        if(preco > 0){
            this.preco = preco;
        } else {
            System.out.println("O preço é inválido. Por isso usaremos 400000000.0");
            this.preco = 400000000.0;
        }
        this.ano = ano;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Carro(String modelo, double preco){
        this(2017, modelo, preco);
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public static void main(String[] args) {
        Carro Carro = new Carro(1997, "supra", 100000000);
        Carro outroCarro = new Carro("skyline", 500000000);

        System.out.println(Carro);
        System.out.println(outroCarro);
    }
    
}

