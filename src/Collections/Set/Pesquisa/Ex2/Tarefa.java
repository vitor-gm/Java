package Collections.Set.Pesquisa.Ex2;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao, boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tarefaConcluida=" + tarefaConcluida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
}
