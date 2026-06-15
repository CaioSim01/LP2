import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioHorista("Caio", "123", 100, 60));
        funcionarios.add(new FuncionarioHorista("Cris", "1234", 120, 50));
        funcionarios.add(new FuncionarioMensalista("tesd", "12345", 1860));
        funcionarios.add(new FuncionarioMensalista("siu", "123456", 5990));

        for(Funcionario f : funcionarios){
            System.out.println("-------------------");
            System.out.println("Nome: " + f.getNome());
            System.out.println("Cpf: " + f.getCpf());
            System.out.println("Salario: " + f.calcularPagamento());
            System.out.println("-------------------\n");

        }
    }
}
