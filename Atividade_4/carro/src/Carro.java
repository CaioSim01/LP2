public class Carro {

    String modelo;
    float velocidade, aceleracao;
    int marcha;

    void virardireita(){
        System.out.println("Carro virando a direita");
    }
    void viraresquerda(){
        System.out.println("Carro virando a esquerda");
    }
    void marchacima(){
        System.out.println("Passando marcha para cima");
    }

    void marchabaixo(){
        System.out.println("Passando marcha para baixo");
    }

    void acelerar(){
        System.out.println("Carro Acelerando");
    }

    void parar(){
        System.out.println("\nCarro Parando");
    }

    void ligar(){
        System.out.println("\nCarro Ligado");
    }
    void desligar(){
        System.out.println("Carro Desligado");
    }
}


