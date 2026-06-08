public class Medico extends Pessoa{
    private String crm, especialidade;

    public Medico(String nome, String sexo, int idade, String cpf, String telefone, String crm, String especialiade){
        super(nome, sexo, idade, cpf, telefone);
        this.crm = crm;
        this.especialidade = especialiade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirPerfil(){
        System.out.println("Dados Pessoais do Médico");
        super.exibirPerfil();
        System.out.println("Crm: " + getCrm());
        System.out.println("Especialidada: " + getEspecialidade());
        System.out.println("\n-----------------------");

    }
}
