package Collections.Set.Pesquisa.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {

    private Set<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean tarefaConcluida) {
        tarefas.add(new Tarefa(descricao, tarefaConcluida));
    }

    public void removerTarefa(String descricao) throws ColecaoVaziaException {
        Tarefa tarefaRemovida = null;
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemovida = t;
                    break;
                }
            }
            tarefas.remove(tarefaRemovida);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public void exibirTarefas() throws ColecaoVaziaException {
        if(!tarefas.isEmpty()) {
            System.out.println(this.tarefas);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> tarefasConcluidas() throws ColecaoVaziaException {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.isTarefaConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> tarefasPendentes() throws ColecaoVaziaException {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(!t.isTarefaConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) throws ColecaoVaziaException {
        Tarefa tarefaMarcarConcluida = null;
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaMarcarConcluida = t;
                    break;
                }
            }
            if(tarefaMarcarConcluida != null) {
                if(!tarefaMarcarConcluida.isTarefaConcluida()) {
                    tarefaMarcarConcluida.setTarefaConcluida(true);
                }
            }else {
                System.out.println("Tarefa não encontrada!");
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao) throws ColecaoVaziaException{
        Tarefa tarefaMarcarPendente = null;
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaMarcarPendente = t;
                    break;
                }
            }
            if(tarefaMarcarPendente != null){
                if(tarefaMarcarPendente.isTarefaConcluida()) {
                    tarefaMarcarPendente.setTarefaConcluida(false);
                }
            }else {
                System.out.println("Tarefa não encontrada!");
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public void removerTodasTarefas() throws ColecaoVaziaException {
        if(!tarefas.isEmpty()) {
            tarefas.clear();
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

}
