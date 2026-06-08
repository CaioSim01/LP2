public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis");
        Livro livro = new Livro("1899", autor, "978-1", "Dom Casmurro", 3);
        Exemplar exemplar = new Exemplar("EX-001", livro, true);
        Funcionario func = new Funcionario("João", "Bibliotecário");

        Emprestimo emp = new Emprestimo(exemplar, func, "06/06/2025", "20/06/2025");

        autor.exibirInformacoes();
        livro.exibirInformacoes();
        func.exibirInformacoes();
        exemplar.exibirInformacoes();
        emp.exibirInformacoes();
}
}
