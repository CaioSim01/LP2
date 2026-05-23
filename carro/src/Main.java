public class Main {

    public static void main (String[] args) {
        Carro carro = new Carro();

        carro.ligar();
        carro.marchacima();
        carro.acelerar();
        carro.marchabaixo();
        carro.virardireita();
        carro.viraresquerda();
        carro.parar();
        carro.desligar();

        carro.modelo = "Celta";
        carro.aceleracao = 10.0f;
        carro.velocidade = 20.0f;
        carro.marcha = 2;

        System.out.printf("\nModelo do carro:%s\n", carro.modelo);
        System.out.printf("Aceleração atingida:%.2fm/s\n", carro.aceleracao);
        System.out.printf("Velocidade atingida:%.2fKm/h\n", carro.velocidade);
        System.out.printf("Marcha passadas:%d\n", carro.marcha);

        carro.parar();
        carro.desligar();
    }
}


