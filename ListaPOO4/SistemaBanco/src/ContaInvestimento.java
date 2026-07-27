public class ContaInvestimento extends Conta implements Investimento {
    private double numero;
    private String titular;
    private double saldo;
    private double juros = 0.2;


    public ContaInvestimento(double numero, String titular, double saldo) {
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

    public void renderJuros(){
        if(saldo<=0){
            System.out.println("\n-----------------------");
            System.out.println("Capital Investido: 0,00");
            System.out.println("Lucro: 0,00");
            System.out.println("-----------------------\n");
            return;
        }
        double lucro= saldo * juros;
        double total = saldo + lucro;
        System.out.println("-----------------------");
        System.out.println("Capital Investido: " + saldo);
        System.out.println("Lucro: " + lucro);
        System.out.println("Total: " + total);
        System.out.println("-----------------------");
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
