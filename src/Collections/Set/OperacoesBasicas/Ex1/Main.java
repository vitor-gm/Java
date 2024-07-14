package Collections.Set.OperacoesBasicas.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Convidado 1", 1234);
        convidados.adicionarConvidado("Convidado 2", 1234);
        convidados.adicionarConvidado("Convidado 3", 1235);
        convidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Número de convidados: " + convidados.contarConvidados());
        convidados.removerConvidadoPorCodigoConvite(1235);
        System.out.println("Número de convidados: " + convidados.contarConvidados());
        convidados.exibirConvidados();
    }
}
