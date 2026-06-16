public abstract class  Operacao{
    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public abstract double operar();

    public double getValor() {
        return valor;
    }
}
