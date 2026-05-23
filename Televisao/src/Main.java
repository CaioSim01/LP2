public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung", 50, 110);

        tv.tamanho=50;
        tv.marca="Samsung";

        System.out.printf("\nMarca da Televisao: %s\n", tv.marca);
        System.out.printf("Tamanho da Televisao: %d Polegadas\n", tv.tamanho);

        tv.ligar();
        tv.aumentarvol();
        tv.diminuirvol();
        tv.subircanal();
        tv.descercanal();
        tv.desligar();

    }
}
