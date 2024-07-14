package Collections.List.OperacoesBasicas.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Fazer exercícios");
        listaTarefa.adicionarTarefa("Comprar pão");

        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Estudar");

        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Estudar");
        listaTarefa.removerTarefa("Comprar leite");
        listaTarefa.removerTarefa("Comprar pão");
        listaTarefa.removerTarefa("Fazer exercícios");



        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
