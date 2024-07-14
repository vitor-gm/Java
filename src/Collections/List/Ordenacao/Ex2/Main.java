package Collections.List.Ordenacao.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        OrdenacaoNumeros num = new OrdenacaoNumeros();

        num.adicionarNumero(2);
        num.adicionarNumero(1);
        num.adicionarNumero(8);
        num.adicionarNumero(4);

        num.exibirNumeros();
        System.out.println(num.ordenarAscendente());
        System.out.println(num.ordenarDescendente());


    }
}
