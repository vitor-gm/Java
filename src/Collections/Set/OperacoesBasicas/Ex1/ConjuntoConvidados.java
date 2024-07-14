package Collections.Set.OperacoesBasicas.Ex1;



import Collections.Exception.ColecaoVaziaException;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }


    public void removerConvidadoPorCodigoConvite(int codigoConvite) throws ColecaoVaziaException {
        Convidado convidadoParaRemover = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() throws ColecaoVaziaException {
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        } else {
            throw new ColecaoVaziaException("A coleção está vazia!");
        }
    }

}
