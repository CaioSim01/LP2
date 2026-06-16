public class Onibus extends Transporte{
    private int linha;

    public Onibus(int capacidade, int linha) {
        super(capacidade);
        this.linha = linha;
    }

    public int getLinha() {
        return linha;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("------------------------");
        System.out.println("Informacoes do Transporte:");
        System.out.println("Transporte: Onibus");
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Linha: " + getLinha());
        System.out.println("------------------------\n");

    }
}
