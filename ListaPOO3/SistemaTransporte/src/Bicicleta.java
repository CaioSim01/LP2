public class Bicicleta extends Transporte{
    private String temMarchas;

    public Bicicleta(int capacidade, String temMarchas) {
        super(capacidade);
        this.temMarchas = temMarchas;
    }

    public String getTemMarchas() {
        return temMarchas;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("------------------------");
        System.out.println("Informacoes do Transporte:");
        System.out.println("Transporte: Bicicleta");
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Tem Marcha: " + getTemMarchas());
        System.out.println("------------------------\n");

    }
}
