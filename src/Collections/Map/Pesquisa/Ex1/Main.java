package Collections.Map.Pesquisa.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(3L, "Arroz", 2, 5d);
        estoque.adicionarProduto(8L, "Feijão", 3, 6d);
        estoque.adicionarProduto(4L, "Macarrão", 6, 7d);
        estoque.adicionarProduto(10L, "Carne", 1, 2d);

        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());

    }
}
