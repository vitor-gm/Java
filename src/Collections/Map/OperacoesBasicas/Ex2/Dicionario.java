package Collections.Map.OperacoesBasicas.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
        palavras.put(palavra, descricao);
    }

    public void removerPalavra(String palavra) throws ColecaoVaziaException {
        if(!palavras.isEmpty()) {
            palavras.remove(palavra);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }

    }

    public void exibirPalavras() throws ColecaoVaziaException {
        if(!palavras.isEmpty()) {
            System.out.println(this.palavras);
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public String pesquisarPorPalavra(String palavra) throws ColecaoVaziaException {
        String descricao = null;
        if (!palavras.isEmpty()) {
            descricao = palavras.get(palavra);

        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return descricao;
    }

}
