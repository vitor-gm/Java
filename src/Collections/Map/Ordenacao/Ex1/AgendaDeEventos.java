package Collections.Map.Ordenacao.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaDeEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() throws ColecaoVaziaException {
        if(!eventosMap.isEmpty()) {
            Map<LocalDate, Evento> agenda = new TreeMap<>(eventosMap);
            System.out.println(agenda);
        }else {
            throw new ColecaoVaziaException("A coleeção está vazia!");
        }

    }

    public void obterProximoEvento() throws ColecaoVaziaException {

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        if(!eventosMap.isEmpty()) {
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O próximo evento : " + proximoEvento + " acontecerá na data " + proximaData);
                    break;
                }
            }
        }else {
            throw new ColecaoVaziaException("A coleção está vazia!");

        }

    }
}
