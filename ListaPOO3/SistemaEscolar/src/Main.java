import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Professor("Pedro", "12345678900", "LP2"));
        pessoas.add(new Aluno("Ana", "12345676890", "20251bsifsa0002"));

        for (Pessoa p : pessoas){
            p.exibirDados();
        }
    }
}