public abstract class Funcionario {
    private String nome, cpf;

    public Funcionario(String nome, String cpf){
        setCpf(cpf);
        setNome(nome);
    }

    public abstract float calcularPagamento();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}