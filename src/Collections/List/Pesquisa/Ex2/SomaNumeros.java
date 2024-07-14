package Collections.List.Pesquisa.Ex2;



import Collections.Exception.ColecaoVaziaException;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() throws ColecaoVaziaException {
        int soma = 0;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                soma += n;
            }
        }else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
        return soma;
    }

    public int encontrarMaiorNumero() throws ColecaoVaziaException {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                if(n >= maiorNumero) {
                    maiorNumero = n;
                }
            }
        }else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() throws ColecaoVaziaException {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()) {
            for(Integer n : numeros) {
                if(n <= menorNumero) {
                    menorNumero = n;
                }
            }
        }else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
        return menorNumero;
    }

    public void exibirNumeros() throws ColecaoVaziaException {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            throw new ColecaoVaziaException("A lista está vazia!");
        }
    }
}
