public class Professor extends Funcionario{
    private String matricula;
    private String nome;
    private double salario;
    private double horaAula;

    public Professor(String matricula, String nome, double salario, double horaAula) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.horaAula = horaAula;
    }

    public Professor(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public void calcularSalario() {
        double salarioNovo = salario + (horaAula * 80);
        System.out.println("Salario: "+ salarioNovo);
    }
}
