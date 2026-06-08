public class Professor extends Pessoa{
    private String materias;
    private String titulacao;
    private double salario;

    public Professor(String nome, String email, String sexo, int idade, String cpf, String telefone, String materias, String titulacao, double salario) {
        super(nome, email, sexo, idade, cpf, telefone);
        this.materias = materias;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirPerfil(){
        super.exibirPerfil();
        System.out.println("Materias: " + getMaterias());
        System.out.println("Titulacao: " + getTitulacao());
        System.out.println("Salario: " + getSalario());
    }
}
