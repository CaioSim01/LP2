public class Calculadora{
private String nome;
private String dono;

    public Calculadora() {
    }

    public Calculadora(String nome) {
        this.nome = nome;
    }

    public Calculadora(String nome, String dono) {
        this.nome = nome;
        this.dono = dono;
    }

    public int somar(int a, int b){
       return a + b;
    }

    public double somar(double a,double b){
        return a + b;
    }

    public int subtracao(int a, int b){
        return a - b;
    }

    public double subtracao(double a,double b){
        return a - b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public double multi(double a,double b){
        return a * b;
    }

    public int divisao(int a, int b){
        if (b == 0){
            System.out.println("Nao existe divisao por zero.");
            return 0;
        }
        return a / b;
    }

    public double divisao(double a,double b){
        return a / b;
    }


}