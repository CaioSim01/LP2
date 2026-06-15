public class FuncionarioMensalista extends Funcionario{
    private float salarioFixo;

    public FuncionarioMensalista(String nome, String cpf, float salarioFixo) {
        super(nome, cpf);
        setSalarioFixo(salarioFixo);
    }

    @Override
    public float calcularPagamento() {
        return salarioFixo;

    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}