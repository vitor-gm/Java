package Collections.Map.Pesquisa.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() throws ColecaoVaziaException {
        if(!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public double calcularValorTotalEstoque() throws ColecaoVaziaException {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() throws ColecaoVaziaException {
        double maiorPreco = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() >= maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;

                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return produtoMaisCaro;
    }
}
