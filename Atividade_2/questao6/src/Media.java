import java.util.Scanner;
public class Media {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nota da Prova 1: ");
        float nota1 = scan.nextFloat();

        System.out.println("Nota da Prova 2: ");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2)/2;

        if (media >= 7) {
            System.out.println("APROVADO");
        }   else System.out.println("REPROVADO");

        scan.close();

    }
}