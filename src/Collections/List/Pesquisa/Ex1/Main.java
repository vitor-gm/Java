package Collections.List.Pesquisa.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adcionarLivro("Teste", "vitor", 2003);
        catalogo.adcionarLivro("Teste", "Roberta", 2004);
        catalogo.adcionarLivro("Teste3", "Ju", 2006);


        System.out.println(catalogo.pesquisarPorTitulo("Teste"));
        System.out.println(catalogo.pesquisarPorAutor("Caio"));
        System.out.println(catalogo.pesquisarPorAutor("Ju"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000, 2010));
        System.out.println(catalogo.pesquisarPorTitulo("Teste"));

    }
}
