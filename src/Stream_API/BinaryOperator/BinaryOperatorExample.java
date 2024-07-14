package Stream_API.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(8, 6, 4, 7, 3);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("Soma: " + resultado);




    }
}
