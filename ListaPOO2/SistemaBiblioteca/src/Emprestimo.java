public class Emprestimo {
    private Exemplar exemplar;
    private Funcionario funcionario;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Exemplar exemplar, Funcionario funcionario, String dataEmprestimo, String dataDevolucao) {
        this.exemplar = exemplar;
        this.funcionario = funcionario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirInformacoes(){
        System.out.println("\nInformacoes do Emprestimo\n");
        System.out.println("Quem Pegou: " + getFuncionario().getNome());
        System.out.println("Data de Emprestimo: " + getDataEmprestimo());
        System.out.println("Data de Devolucao: " + getDataDevolucao());
    }
}
