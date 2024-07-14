package Collections.Map.Ordenacao.Ex2;

import java.util.Comparator;

public class Livro implements Comparator<Livro> {

    private String titulo;
    private  String autor;
    private Double preco;
    private String link;

    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compare(Livro p1, Livro p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }



}
