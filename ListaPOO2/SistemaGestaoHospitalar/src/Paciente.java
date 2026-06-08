public class Paciente extends Pessoa{
    private String sintomas, alergias, doencas, tipoSanguineo;
    private Prontuario prontuario;

    public Paciente(String nome, String sexo, int idade, String cpf, String telefone, String sintomas, String alergias, String doencas, String tipoSanguineo) {
        super(nome, sexo, idade, cpf, telefone);
        this.sintomas = sintomas;
        this.alergias = alergias;
        this.doencas = doencas;
        this.tipoSanguineo = tipoSanguineo;
        this.prontuario = new Prontuario("exame de sangue", "enxaqueca", "dipirona");
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDoencas() {
        return doencas;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public void exibirPerfil(){
        System.out.println("\n-----------------------");
        System.out.println("Dados Pessoais do Paciente");
        super.exibirPerfil();
        System.out.println("Sintomas: " + getSintomas());
        System.out.println("Alergias: " + getAlergias());
        System.out.println("Doenças que possui: " + getDoencas());
        System.out.println("Tipo Sanguíneo: " + getTipoSanguineo());
        System.out.println("\n-----------------------");
    }
}
