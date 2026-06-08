public class Produto {
    int qtd;
    double preco;
    String nome;

    public Produto(){
        this("Agua", 5.00, 80);
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }




}