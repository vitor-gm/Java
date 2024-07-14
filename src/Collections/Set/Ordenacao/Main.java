package Collections.Set.Ordenacao;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1L, "Secador", 110d, 1);
        produtos.adicionarProduto(9L, "Camisa", 80d, 2);
        produtos.adicionarProduto(4L, "Sapato", 60d, 1);
        produtos.adicionarProduto(10L, "Celular", 1000d, 1);

        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
