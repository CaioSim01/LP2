public class Veiculo {
    private String marca, cor;
    private int ano;
    private double velocidademax;

    public Veiculo(String marca, String cor, int ano, double velocidademax) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidademax = velocidademax;
    }

    public void exibirInfo(){
        System.out.println("\n-----------------------");
        System.out.println("Informacoes do Veículo");
        System.out.println("Marca do Veículo: " + getMarca());
        System.out.println("Cor do Veículo: " + getCor());
        System.out.println("Ano do Veículo: " + getAno());
        System.out.println("Velocidade máxima do Veículo: " + getVelocidademax());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidademax() {
        return velocidademax;
    }

    public void setVelocidademax(double velocidademax) {
        this.velocidademax = velocidademax;
    }
}