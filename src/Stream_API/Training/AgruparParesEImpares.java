package Stream_API.Training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparParesEImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> agruparParImpar = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> pares = agruparParImpar.get(true);
        List<Integer> impares = agruparParImpar.get(false);

        System.out.println(pares);
        System.out.println(impares);

    }

}

