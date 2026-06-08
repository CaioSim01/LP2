public class Main {
     public static void main(String[] args){
        Calculadora calc = new Calculadora();
        Calculadora calc1 = new Calculadora("calculadora");
        Calculadora calc2 = new Calculadora("calculadora", "Caio");

         System.out.println("Soma int: " + calc.somar(4, 5));
         System.out.println("Subtracao int: " + calc1.subtracao(4, 5));
         System.out.println("Divisao int: " + calc2.divisao(4, 2));
         System.out.println("Divisao int: " + calc2.divisao(4, 0));
         System.out.println("Multi int: " + calc.multi(4, 5));
         System.out.println("Soma double: " + calc.somar(4.3, 5.4));
    }
}
