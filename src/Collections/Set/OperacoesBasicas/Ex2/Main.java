package Collections.Set.OperacoesBasicas.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Sol");
        conjunto.adicionarPalavra("Ouro");
        conjunto.adicionarPalavra("Memória");
        conjunto.adicionarPalavra("Agilidade");

        conjunto.removerPalavra("Ouro");

        System.out.println(conjunto.verificarPalavra("Memória"));
        System.out.println(conjunto.verificarPalavra("Carro"));


    }
}
