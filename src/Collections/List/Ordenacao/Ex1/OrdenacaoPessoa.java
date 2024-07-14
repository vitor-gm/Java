package Collections.List.Ordenacao.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() throws ColecaoVaziaException {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() throws ColecaoVaziaException {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }
}
