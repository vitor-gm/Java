package Collections.Queue.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        Fila fila = new Fila();

        fila.adicionarPessoa("Karina", 26);
        fila.adicionarPessoa("Marcus", 17);
        fila.adicionarPessoa("Carlos", 19);
        fila.adicionarPessoa("Julianna", 21);

        //fila.removerRetornarPessoa();
        fila.exibirOitemMaisRecente();
        fila.exibirFila();

    }
}
