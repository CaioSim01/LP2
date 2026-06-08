import java.time.LocalDate;

public class Consulta {
    private LocalDate date;
    private String observacoes;
    private Medico medico;
    private Enfermeiro enfermeiro;
    private Paciente paciente;

    public Consulta(Paciente paciente, LocalDate date, String observacoes, Medico medico, Enfermeiro enfermeiro) {
        this.paciente = paciente;
        this.date = date;
        this.observacoes = observacoes;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void agendarConsulta(){
        System.out.println("Consulta Agendada");
        System.out.println("\n-----------------------");
    }

    public void agendarConsulta(LocalDate date){
        System.out.println("Consulta Agendada para o dia: " + getDate());
        System.out.println("\n-----------------------");
    }

    public void agendarConsulta(LocalDate date, String observacoes){
        System.out.println("Consulta Agendada para o dia: " + date);
        System.out.println("Observacoes: " + observacoes);
        System.out.println("\n-----------------------");
    }
}
