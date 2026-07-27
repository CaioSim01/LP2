public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1234567890, "Caio", 25000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234567890, "Jonas", 1000);
        ContaInvestimento contaInvestimento = new ContaInvestimento(1234567890, "Silvia", 2500);

        contaCorrente.depositar(100);
        contaPoupanca.depositar(200);
        contaInvestimento.depositar(300);

        System.out.println("-------------------");

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
        contaInvestimento.consultarSaldo();

        contaCorrente.sacar(250);
        contaPoupanca.sacar(200);
        contaInvestimento.sacar(300);

        System.out.println("-------------------");

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
        contaInvestimento.consultarSaldo();

        contaInvestimento.renderJuros();

    }
}
