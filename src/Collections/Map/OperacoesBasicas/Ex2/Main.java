package Collections.Map.OperacoesBasicas.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        Dicionario palavras = new Dicionario();

        palavras.adicionarPalavra("Arroz", "Comida");
        palavras.adicionarPalavra("Remédio", "Droga");
        palavras.adicionarPalavra("Sol", "Estrela");
        palavras.adicionarPalavra("Cachorro", "Animal");

        palavras.exibirPalavras();
        System.out.println(palavras.pesquisarPorPalavra("Sol"));
        palavras.removerPalavra("Arroz");
        palavras.exibirPalavras();
    }
}
