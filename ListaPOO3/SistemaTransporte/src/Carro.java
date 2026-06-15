public class Carro extends Transporte{
    String combustivel;

    public Carro(int capacidade, String combustivel) {
        super(capacidade);
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("------------------------");
        System.out.println("Informacoes do Transporte:");
        System.out.println("Transporte: Carro");
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Combustivel: " + getCombustivel());
        System.out.println("------------------------\n");

    }
}
