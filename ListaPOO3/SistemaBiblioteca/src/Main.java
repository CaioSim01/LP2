import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();

        itens.add(new Dvd("Piratas do caribe", "120min"));
        itens.add(new Livro("Pequeno Principe", "n sei", 120));
        itens.add(new Revista("jequiti", "10 edicao"));

        for (ItemBiblioteca i : itens){
            i.exibirInformacoes();
        }
    }
}
