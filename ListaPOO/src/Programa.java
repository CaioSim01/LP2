public class Programa {
        public static void main(String[] args) {
            Funcionario f1 = new Funcionario(4500, "Zé",44, "03/02/2026");

             f1.setRg(345254782);
             f1.setCpf(234567910);
             f1.calculaSalario();
             f1.imprimeDados();

             Funcionario f2 = new Funcionario(2000,"Carlos",40, "02/04/2026");

             f2.setRg(12345678);
             f2.setCpf(12345678);
             f2.calculaSalario();
             f2.imprimeDados();
        }

}
