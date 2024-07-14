package Collections.Map.OperacoesBasicas.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }


    public void exibirContatos() throws ColecaoVaziaException {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public void removerContato(String nome) throws ColecaoVaziaException {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome) throws ColecaoVaziaException{
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if(numeroPorNome == null) {
                System.out.println("Contato não encontrado!");
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return numeroPorNome;
    }
}
