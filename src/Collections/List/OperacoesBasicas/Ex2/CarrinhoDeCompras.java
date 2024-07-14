package Collections.List.OperacoesBasicas.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {

        this.itens = new ArrayList<>();
    }

    public void adcionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) throws ColecaoVaziaException {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itens.removeAll(itensParaRemover);
        } else {
            throw new ColecaoVaziaException("O carrinho está vazio!");
        }
    }


    public double calcularValorTotal() throws ColecaoVaziaException {
        double total = 0d;
        if(!itens.isEmpty()) {
            for(Item i : itens) {
                total += i.getPreco() * i.getQuantidade();
            }
            return total;
        }else {
            throw new ColecaoVaziaException("O carrinho está vazio!");
        }

    }

    public void exibirItens() throws ColecaoVaziaException {

        if(!itens.isEmpty()) {
            System.out.println(this.itens);
        }else {
            throw new ColecaoVaziaException("O carrinho está vazio!");
        }
    }
}
