package CRUDBiblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Estudante estudante = new Estudante("caio", "23741776", "bsi", 3, "");
        Repositorio repo = new Repositorio();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1- Adicionar estudante");
            System.out.println("2- Remover estudante");
            System.out.println("3- Consultar estudante");
            System.out.println("4- Listar pessoas");
            System.out.println("5- Sair");

            int input = getInput();

            switch (input) {
                case 1:
                    repo.incluir(criarEstudante());
                    break;
                case 2:
                    String cpfExcluir = definirCpf();
                    Pessoa pessoaParaExcluir = repo.obterPorCpf(cpfExcluir);

                    if (pessoaParaExcluir != null) {
                        repo.excluir(pessoaParaExcluir);
                        System.out.println("Pessoa excluída com sucesso!");
                    } else {
                        System.out.println("Não foi possível excluir. CPF não encontrado.");
                    }
                    break;
                case 3:
                    repo.consultarPessoa(definirCpf());
                    break;
                case 4:
                    repo.listar();
                    break;
                case 5:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }

    //Adicionar estudande no repo
    public static Estudante criarEstudante() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu cpf: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite seu semestre(int): ");
        int semestre = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite sua matricula: ");
        String matricula = scanner.nextLine();

        System.out.println("\nEstudante Criado!\n");

        return new Estudante(nome, cpf, curso, semestre, matricula);
    }

    //Define cpf para ser buscado
    public static String definirCpf() {
        System.out.print("Digite o cpf para ser pesquisado: ");
        return scanner.nextLine();
    }

    //Pegar número input
    public static int getInput() {
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}
