package Collections.Map.Pesquisa.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) throws ColecaoVaziaException {
        if(!contagemMap.isEmpty()) {
            if(contagemMap.containsKey(palavra)) {
                contagemMap.remove(palavra);
            }

        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public int exibirContagemPalavras() throws ColecaoVaziaException {
        int contagemTotal = 0;
        if(!contagemMap.isEmpty()) {
            for (int contagem : contagemMap.values()) {
                contagemTotal += contagem;
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() throws ColecaoVaziaException {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if(!contagemMap.isEmpty()) {
            for(Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
                if(entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
        
        return palavraMaisFrequente;
    }
}
