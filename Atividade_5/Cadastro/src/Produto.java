public class Produto {

    private String nome;
    private int quantidade;
    private float preco;
    private static int contagem = 0;

    public Produto (String Nome , int Quantidade, float Preco) {
        setNome(Nome);
        setQuantidade(Quantidade);
        setPreco(Preco);
        contagem++;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(float preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preco deve ser maior ou igual a zero");
        }
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("A quantidade deve ser maior ou igual a zero");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double calcularValorProduto(){
        return preco * quantidade;
    }

    public static int TotaldeProdutos(){
        return contagem;
    }


}
