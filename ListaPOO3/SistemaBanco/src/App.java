public class App {
        public static void main(String[] args) {

            Banco banco = new Banco("Júlia", null, "Caio",   null, "Carol", null);

            banco.creditar("Júlia", 1250.0);
            banco.creditar("Caio", 1000.0);
            banco.creditar("Carol", 300.0);

            banco.debitar("Júlia", 300.0);

            banco.transferir("Caio", "Carol", 100.0);

            System.out.println("Saldo de Júlia: " + banco.getSaldo("Júlia"));
            System.out.println("Saldo de Caio: " + banco.getSaldo("Caio"));
            System.out.println("Saldo de Carol: " + banco.getSaldo("Carol"));

    }
}
