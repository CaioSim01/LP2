public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Tudo certo no departameto de " + departamento);
    }
}
