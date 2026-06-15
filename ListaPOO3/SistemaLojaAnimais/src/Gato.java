import java.io.StringReader;

public class Gato extends Animal{
    String pelagem;

    public Gato(int idade, String nome, String pelagem) {
        super(idade, nome);
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom(){
        System.out.println("Gato miando");
    }
}
