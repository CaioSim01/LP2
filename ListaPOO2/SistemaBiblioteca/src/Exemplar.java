public class Exemplar {
    private String isbn;
    private Livro livro;
    private boolean disponivel;

    public Exemplar(String isbn, Livro exemplar, boolean disponivel) {
        this.isbn = isbn;
        this.livro = exemplar;
        this.disponivel = disponivel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro getExemplar() {
        return livro;
    }

    public void setExemplar(Livro exemplar) {
        this.livro = exemplar;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestarLivro() {
        if (this.disponivel) {
            this.disponivel = false;
        } else {
            System.out.println("Exemplar indisponível.");
        }
    }

    public void devolverLivro() {
        this.disponivel = true;
    }
    public void exibirInformacoes(){
        System.out.println("\nInformacoes do Exemplar");
        System.out.println("Exemplar: " + getExemplar().getTitulo());
    }
}
