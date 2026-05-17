import java.util.Scanner;
public class Area {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio da circunferencia: ");
        float raio = scan.nextFloat();
        double pi = 3.14;
        double area =  pi * (raio*raio);

        System.out.printf("Area da circunferencia: %.2f", area);
        scan.close();

    }
}