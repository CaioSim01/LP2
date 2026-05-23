public class Televisao{
    int tamanho, canal=0;
    int voltagem, consumo;
    int volume;
    String marca;

    public Televisao(String marca, int polegadas, int voltagem){
        this.marca="Samsung";
        this.tamanho=50;
        this.voltagem=110;
        this.volume=5;
    }
    void aumentarvol() {
        if(volume>=10){
            System.out.println("Nao e possivel aumentar mais o volume");
        } else {
            volume++;
            System.out.println("Volume aumentado: "+ volume);
        }
    }
    void diminuirvol() {
        if(volume<=0){
            System.out.println("Nao e possivel diminuir mais o volume");
        } else {
            volume--;
            System.out.println("Volume diminuido: " + volume);
        }
    }

    void subircanal(){
        canal++;
        System.out.println("Subindo canal: "+ canal);
    }
    void descercanal(){
        canal--;
        System.out.println("Descendo canal: "+ canal);
    }

    void ligar(){
        consumo=voltagem*tamanho;
        System.out.printf("\nTelevisao ligada | Consumo: %dKwH\n", consumo);
    }
    void desligar(){
        System.out.println("Televisao desligada");
    }

}
