public abstract class Conta {
    private double numero;
    private String titular;
    private double saldo;


    public abstract void depositar(double v);

    public abstract void sacar(double valor);

    public abstract void consultarSaldo();


}
