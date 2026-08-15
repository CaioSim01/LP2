public class Livro {
    private String livroTitulo;
    private String autor;
    private String isbn;
    private String editora;

    public Livro(String livroTitulo, String autor, String isbn, String editora) {
        this.livroTitulo = livroTitulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "livroTitulo='" + livroTitulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }

    public String getLivroTitulo() {
        return livroTitulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditora() {
        return editora;
    }
}
