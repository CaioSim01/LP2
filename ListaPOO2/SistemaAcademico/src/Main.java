public class Main {
    public static void main (String[] args){
        Aluno aluno = new Aluno("Caio", "teste@gmail.com", "Masculino", 19, "12345678999", "75980028922", "bsifsa12345", "Sistemas de Informacao", 3);
        Professor prof = new Professor("Joao", "professor@gmail.com", "Masculino", 32, "21346576587", "75980028922", "Lp2, Redes 1, Redes 2", "Mestre", 7000);

        aluno.exibirPerfil();
        prof.exibirPerfil();
    }
}
