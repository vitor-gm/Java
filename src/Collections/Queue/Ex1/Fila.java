package Collections.Queue.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {

    private Queue<Pessoa> pessoas;

    public Fila() {
        this.pessoas = new PriorityQueue<>();
    }

    public void adicionarPessoa(String nome, Integer idade) {
        pessoas.add(new Pessoa(nome, idade));
    }

    public void removerRetornarPessoa() throws ColecaoVaziaException {
        if(!pessoas.isEmpty()) {
            while(!pessoas.isEmpty()) {
                System.out.println(pessoas.poll());
            }

        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public void exibirOitemMaisRecente() throws ColecaoVaziaException{
        if(!pessoas.isEmpty()) {
            System.out.println(pessoas.peek());
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }

    }

    public void exibirFila() throws ColecaoVaziaException{
        if(!pessoas.isEmpty()) {
            System.out.println(pessoas);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }
}
