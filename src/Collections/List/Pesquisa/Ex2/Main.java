package Collections.List.Pesquisa.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(7);

        numeros.exibirNumeros();

        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());
        System.out.println(numeros.calcularSoma());
    }
}
