package Collections.Map.Pesquisa.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Carro", 3);
        contagem.adicionarPalavra("Bicicleta", 5);
        contagem.adicionarPalavra("Moto", 1);
        contagem.adicionarPalavra("Barco", 2);


        System.out.println(contagem.exibirContagemPalavras());
        System.out.println(contagem.encontrarPalavraMaisFrequente());

    }
}
