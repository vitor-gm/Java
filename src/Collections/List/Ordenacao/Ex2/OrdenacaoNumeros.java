package Collections.List.Ordenacao.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numeros) {
        numerosList.add(numeros);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() throws ColecaoVaziaException {
        List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
    }

    public void exibirNumeros() throws ColecaoVaziaException {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            throw new ColecaoVaziaException("A lista está vazia!");

        }
    }

    public List<Integer> getNumerosList() {
        return numerosList;
    }
}
