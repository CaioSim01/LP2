import java.util.Scanner;
public class Salario {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da hora/aula: ");
        float hora_aula = scan.nextFloat();

        System.out.println("Numero de horas trabalhadas no mes: ");
        int  hora_trab= scan.nextInt();

        System.out.println("Percentual de desconto do INSS: ");
        float desc = scan.nextFloat();


        float salario_bruto = hora_aula * hora_trab;
        float salario_liq = salario_bruto - (salario_bruto * desc);

        System.out.printf("Salario Liquido: %.2f", salario_liq);
        scan.close();

    }
}