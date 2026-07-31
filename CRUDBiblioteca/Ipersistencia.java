package CRUDBiblioteca;

public interface Ipersistencia {

    void incluir(Pessoa p);
    void excluir(Pessoa p);
    void consultarPessoa(String cpf);
    void listar();
}
