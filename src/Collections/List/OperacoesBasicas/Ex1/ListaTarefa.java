package Collections.List.OperacoesBasicas.Ex1;



import Collections.Exception.ColecaoVaziaException;
import Collections.Exception.ColecaoVaziaException;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa  {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) throws ColecaoVaziaException {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()) {
            for(Tarefa t : tarefaList) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() throws ColecaoVaziaException {
        if(!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        }else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
    }
}
