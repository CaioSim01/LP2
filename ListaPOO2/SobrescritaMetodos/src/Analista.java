public class Analista extends Funcionario{
    private String area;

    public Analista(String nome, String cargo, double salario, String area){
        super(nome, cargo, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.printf("A area de %s esta muito eficiente. ", area);
    }
}
