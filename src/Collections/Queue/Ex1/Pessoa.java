package Collections.Queue.Ex1;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareToIgnoreCase(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }


}
