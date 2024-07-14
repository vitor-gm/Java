package Collections.List.Ordenacao.Ex1;


import Collections.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 12, 1.46);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 48, 1.79);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 34, 1.80);

        System.out.println(ordenacaoPessoa.getPessoaList());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }
}
