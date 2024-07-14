package Collections.Map.Ordenacao.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }
    public void adicionarLivro(String link, String titulo, String autor, Double preco) {
        livros.put(link, new Livro(titulo, autor, preco));

    }

    public void removerLivro(String titulo) throws ColecaoVaziaException {
        List<String> chavesRemover = new ArrayList<>();
        if(!livros.isEmpty()) {
            for(Map.Entry<String, Livro> entry : livros.entrySet()) {
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chavesRemover.add(entry.getKey());

                }
            }
            for(String chave : chavesRemover) {
                livros.remove(chave);
            }

        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() throws ColecaoVaziaException {

        Map<String, Livro> livrosPorPreco;
        if (!livros.isEmpty()) {
            List<Map.Entry<String, Livro>> livrosPorPrecos = new ArrayList<>(livros.entrySet()); //Inicializa uma nova List com com todos os elementos do conjunto de entradas do Map
            Collections.sort(livrosPorPrecos, new ComparatorPorPreco());
            livrosPorPreco = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> entry : livrosPorPrecos) {
                livrosPorPreco.put(entry.getKey(), entry.getValue());
            }
        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return livrosPorPreco;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) throws ColecaoVaziaException {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(livros.isEmpty()) {
            throw new ColecaoVaziaException("A Coleção está vazia!");
        }else {
            for(Map.Entry<String, Livro> a : livros.entrySet()) {
                if(a.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(a.getValue());
                }

            }
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() throws ColecaoVaziaException {
        Livro livroMaisCaro;
        if (livros.isEmpty()) {
            throw new ColecaoVaziaException("A coleção está vazia!");
        } else {
            double livro = Double.MIN_VALUE;
            livroMaisCaro = null;
            for (Map.Entry<String, Livro> l : livros.entrySet()) {
                if (l.getValue().getPreco() > livro) {
                    livroMaisCaro = l.getValue();

                }

            }
        }
        return livroMaisCaro;
    }



}
