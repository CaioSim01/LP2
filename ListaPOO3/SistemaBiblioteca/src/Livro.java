public class Livro extends ItemBiblioteca{
    private String autor;
    private int numeropag;

    public Livro(String titulo, String autor, int numeropag) {
        super(titulo);
        this.autor = autor;
        this.numeropag = numeropag;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeropag() {
        return numeropag;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("---------------------");
        System.out.println("Informacoes do Livro:");
        System.out.println("Autor: " + getAutor());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Numero de Paginas: " + getNumeropag());
        System.out.println("---------------------");
    }
}
