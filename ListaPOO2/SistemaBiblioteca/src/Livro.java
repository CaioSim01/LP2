public class Livro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private String anoPublicacao;
    private int qtdDisponivel;

    public Livro( String anoPublicacao, Autor autor, String isbn, String titulo, int qtdDisponivel) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.qtdDisponivel = qtdDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public void exibirInformacoes(){
        System.out.println("\nInformacoes do Livro");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor().getNome());
        System.out.println("Isbn: " + getIsbn());
        System.out.println("Data de Publicacao: " + getAnoPublicacao());
        System.out.println("Quantidade Disponivel: " + getQtdDisponivel());
    }


}
