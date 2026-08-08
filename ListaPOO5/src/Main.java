public class Main {
    public static void main(String[] args) {
    CalculadoraSeguro calculadoraSeguro = new CalculadoraSeguro();

        try {
            calculadoraSeguro.calcularValorCarro();
        } catch (IdadeInvalidaException e) {
            throw new RuntimeException(e);
        }
    }
}
