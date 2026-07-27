public class Coordenador extends Funcionario{
    private String matricula;
    private String nome;
    private double salario;
    private final double gratificacao = 500;

    public Coordenador(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }



    @Override
    public void calcularSalario() {
        double salarioNovo = salario + gratificacao;
        System.out.println("Salario: " + salarioNovo);
    }
}
