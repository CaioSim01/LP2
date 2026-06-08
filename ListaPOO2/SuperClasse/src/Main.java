public class Main {
    public static void main(String[] args){
        Veiculo veiculo = new Veiculo("BMW", "Preto", 2025, 200);
        Carro carro = new Carro("Fiat", "Branco", 2015, 150, "Uno", "Fiasa 1.0", "Gasolina");

        veiculo.exibirInfo();
        carro.exibirInfo();
    }
}
