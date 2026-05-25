import java.util.Scanner;

public class Maior{
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float num1 = scan.nextFloat();

        System.out.println("Digite um numero: ");
        float num2 = scan.nextFloat();

        float soma = num1 + num2;

        if (soma > 10) {
            System.out.printf("A Soma eh: %.2f", soma);
        }

        scan.close();

    }
}
