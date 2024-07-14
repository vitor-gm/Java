package Collections.Queue.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        OrdemDeEnvio ordem = new OrdemDeEnvio();
        ordem.adicionarProduto("Sabão", 2d);
        ordem.adicionarProduto("Pão", 1d);
        ordem.adicionarProduto("Café", 4d);
        ordem.adicionarProduto("Arroz", 6d);

        System.out.println(ordem.produtosPorPreco());

    }
}
