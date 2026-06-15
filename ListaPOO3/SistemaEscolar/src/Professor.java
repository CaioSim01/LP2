public class Professor extends Pessoa{
    String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibirDados(){
        System.out.println("-------------------------");
        System.out.println("Informacoes do Professor:");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("-------------------------\n");
    }
}
