import java.util.Scanner;

public class Cnh {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Voce pode tirar a carteira de motorista.");
        }   else System.out.println("Voce não pode tirar a carteira de motorista.");
        
        scan.close();
    }

}
