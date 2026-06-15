import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    ArrayList<Animal> animais = new ArrayList<>();

    animais.add(new Cachorro(5, "scooby", "vira lata"));
    animais.add(new Gato(6, "tom", "cinza"));
    animais.add(new Aves(2, "pica-pau", "pica-pau"));

        for (Animal a : animais){
            a.emitirSom();
        }


    }
}
