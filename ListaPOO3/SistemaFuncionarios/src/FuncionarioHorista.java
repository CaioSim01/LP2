public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private float valorHora;

    public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas, float valorHora){
        super(nome, cpf);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    @Override
    public float calcularPagamento(){
        return horasTrabalhadas * valorHora;

    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
