public class Aves extends Animal{
    private String tipoEspecifico;

    public Aves(int idade, String nome, String tipoEspecifico) {
        super(idade, nome);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public void emitirSom(){
        System.out.println("Ave emitindo som");
    }
}
