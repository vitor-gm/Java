package Collections.List.Pesquisa.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adcionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) throws ColecaoVaziaException {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }else {
            throw new ColecaoVaziaException("O catálogo está vazio!");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) throws ColecaoVaziaException {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }else {
            throw new ColecaoVaziaException("O catálogo está vazio!");
        }
        return livrosPorIntervaloAnos;
    }

    //Pesquisar a primeira ocorrencia.
    public Livro pesquisarPorTitulo(String titulo) throws ColecaoVaziaException {

        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;

                }
            }
        }else {
            throw new ColecaoVaziaException("O catálogo está vazio!");
        }

        return livroPorTitulo;
    }


}
