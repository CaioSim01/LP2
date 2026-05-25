public class Programa {
    public static void main (String[] args) {
        Produto produto = new Produto("Refri", 10, 15);
        Produto produto2 = new Produto("Salgadinho", 1, 23);
        Produto produto3 = new Produto("Agua", 100, 12);
        Produto produto4 = new Produto("Teste", -1999, -4);
        double ValorTotalEstoque = produto.calcularValorProduto() + produto2.calcularValorProduto() + produto3.calcularValorProduto();

        System.out.println("--- DADOS DO PRODUTO 1 ---");
        System.out.println("Nome: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f\n", produto.getPreco());
        System.out.println("Estoque: " + produto.getQuantidade());
        System.out.printf("Valor em Estoque deste produto: R$ %.2f\n", produto.calcularValorProduto());
        System.out.println();

        System.out.println("--- DADOS DO PRODUTO 2 ---");
        System.out.println("Nome: " + produto2.getNome());
        System.out.printf("Preço: R$ %.2f\n", produto2.getPreco());
        System.out.println("Estoque: " + produto2.getQuantidade());
        System.out.printf("Valor em Estoque deste produto: R$ %.2f\n", produto2.calcularValorProduto());
        System.out.println();

        System.out.println("--- DADOS DO PRODUTO 3 ---");
        System.out.println("Nome: " + produto3.getNome());
        System.out.printf("Preço: R$ %.2f\n", produto3.getPreco());
        System.out.println("Estoque: " + produto3.getQuantidade());
        System.out.printf("Valor em Estoque deste produto: R$ %.2f\n", produto3.calcularValorProduto());
        System.out.println();

        System.out.println("--- DADOS DO ESTOQUE ---");
        System.out.printf("Valor total do estoque:R$ %.2f\n", ValorTotalEstoque);
        System.out.println("Total de produtos: " + Produto.TotaldeProdutos());
    }
}
