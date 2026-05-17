import java.util.Scanner;

 public class Termometro {
     public static void main (String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.println("Informe sua temperatura: ");

         float temperatura = scan.nextFloat();

         if (temperatura >= 37) {
             System.out.println("Voce esta com febre.");
         }   else System.out.println("Voce nao esta com febre.");

         scan.close();
     }
 }
