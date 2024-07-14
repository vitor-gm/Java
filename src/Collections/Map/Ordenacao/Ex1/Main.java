package Collections.Map.Ordenacao.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        AgendaDeEventos eventos = new AgendaDeEventos();

        eventos.adicionarEvento(LocalDate.of(2024, 12, 3), "Evento 1", "Atração 1");
        eventos.adicionarEvento(LocalDate.of(2024, 9,6), "Evento 2", "Atração 2");
        eventos.adicionarEvento(LocalDate.of(2024, 10, 5), "Evento 3", "Atração 3");
        eventos.adicionarEvento(LocalDate.of(2024, 8, 7), "Evento 4", "Atração 4");

        eventos.exibirAgenda();
        eventos.obterProximoEvento();
    }
}
