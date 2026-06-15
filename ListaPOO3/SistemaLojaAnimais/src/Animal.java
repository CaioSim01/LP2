public abstract class Animal{
    int idade;
    String nome;

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public abstract void emitirSom();
}
