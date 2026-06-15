import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Transporte> frota = new ArrayList<>();

        frota.add(new Carro(5, "Gasolina"));
        frota.add(new Onibus(50, 101));
        frota.add(new Bicicleta(1, "Sim"));

        for (Transporte t : frota){
            t.exibirInformacoes();
        }
    }
}
