package Collections.Set.Ordenacao;




import Collections.Exception.ColecaoVaziaException;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() throws ColecaoVaziaException {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public Set<Produto> exibirProdutosPorPreco() throws ColecaoVaziaException {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }
}
