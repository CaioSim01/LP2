public abstract class Transporte{
    int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void exibirInformacoes();

    public int getCapacidade() {
        return capacidade;
    }
}
