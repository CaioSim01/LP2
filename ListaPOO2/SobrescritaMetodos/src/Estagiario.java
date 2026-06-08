public class Estagiario extends Funcionario{
    private String curso;

    public Estagiario(String nome, String cargo, double salario, String curso) {
        super(nome, cargo, salario);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Todas as tarefas concluídas.");
    }
}
