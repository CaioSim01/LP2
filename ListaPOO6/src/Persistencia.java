import java.util.ArrayList;
import java.util.List;

public class Persistencia {
    List<Livro> livros = new ArrayList<>();

    public void adcLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado.");
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido.");
    }

    public void imprimir() {
        for (Livro livro : livros) {
            System.out.println("----------------");
            System.out.println("Informaçoes: ");
            System.out.println("Titulo: "+ livro.getLivroTitulo());
            System.out.println("Autor: "+livro.getAutor());
            System.out.println("Editora: "+livro.getEditora());
            System.out.println("Isbn: "+livro.getIsbn());
            System.out.println("----------------");
        }
    }

    public void verificarLivro(Livro l) {
        for (Livro livro : livros) {
            if (l.getLivroTitulo().equals(livro.getLivroTitulo())){
            System.out.println("Livro encontrado.");
            return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }

    public void obterLivro(Livro l){
        for (Livro livro : livros) {
            if (l.getLivroTitulo().equals(livro.getLivroTitulo())) {
                System.out.println("Informaçoes do livro: ");
                System.out.println("Titulo: " + livro.getLivroTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Isbn: " + livro.getIsbn());
                System.out.println("----------------\n");
            } else if(l.getAutor().equals(livro.getAutor())){
                System.out.println("Livros Semelhantes: ");
                System.out.println("Titulo: " + livro.getLivroTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Isbn: " + livro.getIsbn());
                System.out.println("----------------\n");
            }
            else {
                System.out.println("Esse livro nao existe na coleçao.");
            }
        }
    }

    public boolean verificarLista(){
        return livros.isEmpty();
    }
}
