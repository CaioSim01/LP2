import java.util.Scanner;
public class Imc {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        float altura = scan.nextFloat();

        System.out.println("Informe o seu peso: ");
        float peso = scan.nextFloat();

        float imc = peso/(altura*altura);

        if (imc >= 30) {
            System.out.println("Voce esta obeso.");
        }   else System.out.println("Voce nao esta obeso.");

        scan.close();

    }
}