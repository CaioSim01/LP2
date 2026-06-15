public class App {
        public static void main(String[] args) {

            Banco banco = new Banco("Alice", null, "Caio",   null, "Carol", null);

            banco.creditar("Alice", 1250.0);
            banco.creditar("Caio", 1000.0);
            banco.creditar("Carol", 300.0);

            banco.debitar("Alice", 300.0);

            banco.transferir("Caio", "Carol", 100.0);

            System.out.println("Saldo de Alice: " + banco.getSaldo("Alice"));
            System.out.println("Saldo de Caio: " + banco.getSaldo("Caio"));
            System.out.println("Saldo de Carol: " + banco.getSaldo("Carol"));

    }
}
