import java.util.Scanner;

public class CalculadoraSeguro {
    private double valor_carro;
    private int idade;
    private double seguro_veiculo;
    Scanner scanner = new Scanner(System.in);

    public void calcularValorCarro() throws IdadeInvalidaException {
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if (idade < 18) {
            throw new IdadeInvalidaException("Idade do condutor invalida.");
        }

        System.out.println("Digite o valor do seu carro: ");
        valor_carro = scanner.nextDouble();
        if (valor_carro <= 0) {
            throw new IllegalArgumentException("Valor do carro invalido.");
        }

        if (idade < 25) {
            seguro_veiculo = 0.07 * valor_carro;
        } else {
            seguro_veiculo = 0.05 * valor_carro;
        }

        System.out.println("Valor do Seguro: " + seguro_veiculo);
    }
}
