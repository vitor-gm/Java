package Controle_De_Fluxo;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = terminal.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        }catch(ParametrosInvalidosException e){
            throw new ParametrosInvalidosException(e.getMessage());
        }finally {
            if(terminal != null) {
                terminal.close();
            }
        }

    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {

        if(segundoNumero < primeiroNumero){
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
        }else{
            int resultado = segundoNumero - primeiroNumero;
            for(int i = 1; i <= resultado; i++){
                System.out.println("Imprimindo número " + i);
            }
        }

    }
    
}