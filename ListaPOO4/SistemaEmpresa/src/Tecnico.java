public class Tecnico extends Funcionario{
    private String matricula;
    private String nome;
    private double salario;
    private double adcInsalubridade;

    public Tecnico(String matricula, String nome, double salario, double adcInsalubridade) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.adcInsalubridade = adcInsalubridade;
    }

    @Override
    public void calcularSalario() {
        double salarioNovo = salario + adcInsalubridade*salario;
        System.out.println("Salario: " + salarioNovo);
    }


}
