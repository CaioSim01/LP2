public class Coordenador extends Pessoa implements Autenticacao{
    private String nome;
    private String matricula;

    public Coordenador(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void aprovarPlanoEnsino(){
        System.out.println("Aprovando plano de ensino.");
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
