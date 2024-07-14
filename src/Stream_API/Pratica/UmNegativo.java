package Stream_API.Pratica;

import java.util.Arrays;
import java.util.List;

public class UmNegativo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean positivo = numeros.stream()
                .filter(n -> n < 0)
                .toList()
                .isEmpty();
        if(positivo){
            System.out.println("A lista não contém um número negativo!");
        }else {
            System.out.println("A lista contém pelo menos um número negativo!");
        }
    }
}
