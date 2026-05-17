import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float dist, preco, gasolina, valorpago;

        System.out.println("Informe a distância em km: ");
        dist = scanner.nextFloat();

        System.out.println("Informe o preço da gasolina: ");
        preco = scanner.nextFloat();

        gasolina = dist/12;

        valorpago = gasolina * preco;

        System.out.printf("Quantidade de gasolina que será necessária: %.2f%n", gasolina);
        System.out.printf("Preço a ser pago: R$%.2f", valorpago);

        scanner.close();
    }
}