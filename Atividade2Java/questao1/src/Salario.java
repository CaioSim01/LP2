
import java.util.Scanner;
public class Salario {

    public static void main (String[] args) {
        int horas;
        float salario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Horas Trabalhadas no mês: ");
        horas= scanner.nextInt();

        salario= horas*20;

        System.out.println("O Seu Salário é: " + salario);
        scanner.close();
    }
}