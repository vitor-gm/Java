package Stream_API.Training;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ProdutoDosNumeros {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> multiplicar = (a, b) -> a * b;

         int result =numeros.stream()
                .reduce(1, multiplicar);

        System.out.println(result);
    }


}
