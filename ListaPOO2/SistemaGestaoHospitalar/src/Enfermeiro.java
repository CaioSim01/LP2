public class Enfermeiro extends Pessoa{
    private String coren, turno;

    public Enfermeiro(String nome, String sexo, int idade, String cpf, String telefone, String coren, String turno) {
        super(nome, sexo, idade, cpf, telefone);
        this.coren = coren;
        this.turno = turno;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void exibirPerfil(){
        System.out.println("Dados Pessoais do enfermeiro");
        super.exibirPerfil();
        System.out.println("Coren: " + getCoren());
        System.out.println("Turno: " + getTurno());
        System.out.println("\n-----------------------");
    }
}
