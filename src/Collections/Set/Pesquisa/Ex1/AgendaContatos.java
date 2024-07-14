package Collections.Set.Pesquisa.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() throws ColecaoVaziaException {
        if(!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) throws ColecaoVaziaException {
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if(c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) throws ColecaoVaziaException {
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if(c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return contatoAtualizado;
    }
}
