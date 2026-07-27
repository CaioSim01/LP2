public class CalculadoraSalarios {
    public void main(String[] args) {
        Professor professor = new Professor("123", "Caio", 3500, 80);
        Coordenador coordenador = new Coordenador("1234", "Cleber", 9000);
        Tecnico tecnico = new Tecnico("12345", "Julio", 5000, 0.1);

        professor.calcularSalario();
        coordenador.calcularSalario();
        tecnico.calcularSalario();
    }
}
