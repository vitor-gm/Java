package Collections.List.OperacoesBasicas.Ex2;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
