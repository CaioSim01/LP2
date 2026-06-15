public class Revista extends ItemBiblioteca{
    private String edicao;


    public Revista(String titulo, String edicao) {
        super(titulo);
        setEdicao(edicao);
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("---------------------");
        System.out.println("Informacoes da Revista:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Edicao: " + getEdicao());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("---------------------");
    }
}
