package Stream_API.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(25, 17, 18, 30, 20);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        numerosDobrados.forEach(System.out::println);


        //Lambda
        numeros.stream().
                map(n -> n * 2)
                .toList()
                .forEach(System.out::println);
    }
}
