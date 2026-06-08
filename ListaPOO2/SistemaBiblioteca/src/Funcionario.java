public class Funcionario {
    private int matricula;
    private String nome;
    private String cargo;
    private static int geraMatricula = 0;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = geraMatricula++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void exibirInformacoes(){
        System.out.println("\nInformacoes do Funcionario");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Matricula: " + getMatricula());
    }

}
