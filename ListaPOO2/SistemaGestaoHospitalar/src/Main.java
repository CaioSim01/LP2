import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
    Paciente paciente = new Paciente("Caio",  "Masculino", 19, "12345678900", "7590028922", "dor de cabeca, dor no corpo, febre", "nenhuma", "rinite", "B+");
    Medico medico = new Medico("Dr.Marcos",  "Masculino", 38, "12345678900", "7590028922", "CRM-123", "Clinico Geral");
    Enfermeiro enfermeiro = new Enfermeiro("Julia",  "Feminino", 26, "12345678900", "7590028922", "Coren-BA 102043-ENF.", "Vespertino");
    Consulta consulta = new Consulta(paciente, LocalDate.of(2026, 6, 7), "Beber bastante agua no dia anterior, vir em jejum", medico, enfermeiro);
    Prontuario prontuario = new Prontuario("Exame de sangue", "Paciente diagnosticado com Gripe", "ibruprofeno, repouso, consumir bastante liquido");

    paciente.setEmail("caio@gmail.com");
    enfermeiro.setEmail("julia@gmail.com");
    medico.setEmail("marcos@gmail.com");
    paciente.exibirPerfil();
    enfermeiro.exibirPerfil();
    medico.exibirPerfil();
    consulta.agendarConsulta(LocalDate.of(2026, 6, 7), "Beber bastante agua");
    }
}
