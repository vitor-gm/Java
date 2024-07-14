package Stream_API.Pratica;

import java.util.Arrays;
import java.util.List;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumero = numeros.stream()
                .filter(n -> {
                    if(n < 2) {
                        return false;
                    }
                    for(int i = 2; i < Math.sqrt(n); i++) {
                        if(n % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .sorted((n1, n2) -> n2 - n1)
                .toList()
                .get(0);


        System.out.println(maiorNumero);
    }
}
