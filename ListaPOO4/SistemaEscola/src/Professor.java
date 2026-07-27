public class Professor extends Pessoa implements Autenticacao{
    private String nome;
    private String matricula;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void ministrarDisciplinas(){
        System.out.println("Ministrando disciplinas.");
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticado no sistema.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
