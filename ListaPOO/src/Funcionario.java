public class Funcionario {
    private String nome;
    private int cpf;
    private int rg;
    private int matricula;
    private double salarioBase;
    private double salario;
    private int horasTrab;
    private static int geraMatricula = 0;
    private String dataContratacao;

    public Funcionario(int salarioBase, String nome, int horasTrab, String data){
        setSalarioBase(salarioBase);
        setNome(nome);
        setHorasTrab(horasTrab);
        this.dataContratacao= data;
        this.matricula = geraMatricula++;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getRg() {
        return rg;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getCpf() {
        return cpf;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public int getMatricula() {
        return matricula;
    }

    public void calculaSalario(){
        Calculo calculo = new Calculo();
        calculo.setSalario_base(getSalarioBase());
        calculo.setHoras_trab(getHorasTrab());
        calculo.calculaSalario();
        this.salario= calculo.getTotalSalario();

    }

    public void imprimeDados(){
        System.out.println("---------------------");
        System.out.println("Dados do Funcionario");
        System.out.println("Nome: "+ getNome());
        System.out.println("Cpf: "+ getCpf());
        System.out.println("Data de Contratacao: "+ getDataContratacao());
        System.out.println("Salario: "+ getSalario());
        System.out.println("Matricula: "+ getMatricula());

    }
}
