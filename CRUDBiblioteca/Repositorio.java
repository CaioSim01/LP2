package CRUDBiblioteca;

import java.util.ArrayList;

public class Repositorio implements Ipersistencia{
    ArrayList<Pessoa> repoBanco = new ArrayList<>();

    public Pessoa obterPorCpf(String cpfBusca) {
        for (Pessoa pessoa : repoBanco) {
            if (cpfBusca.equals(pessoa.getCpf())) {
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public void incluir(Pessoa p) {
        repoBanco.add(p);
        System.out.println("Pessoa incluida no banco!");
    }

    @Override
    public void excluir(Pessoa p) {
        boolean foiRemovido = repoBanco.remove(p);

        if(!foiRemovido) {
            System.out.println("Pessoa não encontrada.");
        }
    }

    @Override
    public void consultarPessoa(String cpfBusca) {
        for (Pessoa pessoa : repoBanco) {
            if (cpfBusca.equals(pessoa.getCpf())) {
                System.out.println("Pessoa encontrada:");
                System.out.println(pessoa);
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    @Override
    public void listar() {
        repoBanco.forEach(pessoa -> System.out.println(pessoa));
    }

}