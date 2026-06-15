public class Dvd extends ItemBiblioteca{
    private String duracao;


    public Dvd(String titulo, String duracao) {
        super(titulo);
        setDuracao(duracao);
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("---------------------");
        System.out.println("Informacoes do Dvd:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("---------------------");
    }
}
