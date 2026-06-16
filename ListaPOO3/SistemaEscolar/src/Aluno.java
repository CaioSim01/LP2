public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void exibirDados(){
        System.out.println("-------------------------");
        System.out.println("Informacoes do Aluno:");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("-------------------------\n");
    }
}
