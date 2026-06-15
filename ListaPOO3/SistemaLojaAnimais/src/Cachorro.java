public class Cachorro extends Animal{
    String raca;

    public Cachorro(int idade, String nome, String raca) {
        super(idade, nome);
        this.raca = raca;
    }

    @Override
    public void emitirSom(){
        System.out.println("Cachorro latindo");
    }
}
