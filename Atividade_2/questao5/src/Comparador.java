import java.util.Scanner;

public class Comparador{
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite um numero: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.printf("O maior numero digitado foi: %d", num1);
        }   else System.out.printf("O maior numero digitado foi: %d", num2);

        scan.close();

    }
}


