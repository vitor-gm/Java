package Collections.Map.Ordenacao.Ex2;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        LivrariaOnline livros = new LivrariaOnline();

        livros.adicionarLivro("Amazon.com/livro1", "Titulo 1", "Autor 1", 5d);
        livros.adicionarLivro("Amazon.com/livro2", "Titulo 2", "Autor 2", 3d);
        livros.adicionarLivro("Amazon.com/livro3", "Titulo 3", "Autor 3", 1d);
        livros.adicionarLivro("Amazon.com/livro4", "Titulo 4", "Autor 4", 12d);
        livros.adicionarLivro("Amazon.com/livro5", "Titulo 5", "Autor 4", 9d);
        livros.adicionarLivro("Amazon.com/livro6", "Titulo 6", "Autor 4", 12d);


        System.out.println(livros.exibirLivrosOrdenadosPorPreco());
        System.out.println(livros.pesquisarLivrosPorAutor("Autor 4"));
        System.out.println(livros.obterLivroMaisCaro());

    }
}
