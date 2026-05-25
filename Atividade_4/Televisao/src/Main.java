public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Lg", 50, 110);


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
