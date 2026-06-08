public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private int periodo;


    public Aluno(String nome, String email, String sexo, int idade, String cpf, String telefone, String matricula, String curso, int periodo) {
        super(nome, email, sexo, idade, cpf, telefone);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void exibirPerfil(){
        super.exibirPerfil();
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
        System.out.println("Periodo: " + getPeriodo());
    }
}
