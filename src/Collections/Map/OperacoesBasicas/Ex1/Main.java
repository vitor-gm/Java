package Collections.Map.OperacoesBasicas.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Vitor", 963254358);
        contatos.adicionarContato("Camila", 963236358);
        contatos.adicionarContato("Rachel", 963228358);
        contatos.adicionarContato("Gabrielle", 963286358);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("Rachel"));
    }
}
