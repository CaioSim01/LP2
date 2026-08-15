public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java 2", "Joao Pedro", "1414", "Aurora");
        Livro livro2 = new Livro("Java 3", "Joao Silva", "1212", "Aurora Azul");
        Livro livro3 = new Livro("Java 4", "Joao Silva", "1010", "Sao Paulo");
        Persistencia persistencia = new Persistencia();

        persistencia.adcLivro(livro1);
        persistencia.adcLivro(livro2);
        persistencia.adcLivro(livro3);

        persistencia.verificarLivro(livro1);

        persistencia.imprimir();

        persistencia.removerLivro(livro3);
        persistencia.imprimir();
        persistencia.obterLivro(livro3);

        System.out.println(persistencia.verificarLista());
    }
}
