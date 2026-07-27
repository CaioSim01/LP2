public class ContaPoupanca extends Conta{
    private double numero;
    private String titular;
    private double saldo;

    public ContaPoupanca(double numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -=valor;
    }

    @Override
    public void consultarSaldo() {
        if(saldo<=0){
            System.out.println("Saldo: 0,00");
            return;
        }
        System.out.println("Saldo: "  + saldo);
    }

    public double getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


}
