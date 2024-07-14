package Collections.Set.Pesquisa.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 986523472);
        agendaContatos.adicionarContato("João", 963821547);
        agendaContatos.adicionarContato("Caio", 987250147);
        agendaContatos.adicionarContato("Camila Alves", 923651407);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaContatos.atualizarNumeroContato("Camila", 96666666));
        agendaContatos.exibirContatos();

    }
}
