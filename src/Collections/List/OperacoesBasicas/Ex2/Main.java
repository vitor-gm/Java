package Collections.List.OperacoesBasicas.Ex2;


import Collections.Exception.ColecaoVaziaException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adcionarItem("Café", 13d, 3);
        carrinho.adcionarItem("Arroz", 7d, 2);
        carrinho.adcionarItem("Feijão", 8d, 1);

        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());

    }
}