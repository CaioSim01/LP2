public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Cleber", "professor1234");
        Aluno aluno = new Aluno("Caio", "bsi1234");
        Coordenador coordenador = new Coordenador("Cleber", "coordenador1234");

        professor.autenticar();
        aluno.autenticar();
        coordenador.autenticar();
        System.out.println("--------------------");
        professor.ministrarDisciplinas();
        aluno.realizarMatricula();
        coordenador.aprovarPlanoEnsino();
    }
}
