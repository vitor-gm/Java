package Collections.Queue.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrdemDeEnvio {

    private Queue<Produto> produtos;

    public OrdemDeEnvio() {
        this.produtos = new PriorityQueue<>();
    }

    public void adicionarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
    }

    public void exibirProdutos() throws ColecaoVaziaException {
        if(!produtos.isEmpty()) {
            System.out.println(produtos);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public Queue<Produto> produtosPorPreco() {
        Queue<Produto> ordemPorPreco = new PriorityQueue<>(new ComparatorPorPreco());
        ordemPorPreco.addAll(produtos);
        return ordemPorPreco;
    }
}
