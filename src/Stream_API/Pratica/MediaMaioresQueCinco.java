package Stream_API.Pratica;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MediaMaioresQueCinco {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .mapToInt(Integer::intValue)//Aplica a função intValue() p/ converter em um int e retorna um IntStream(tipo de stream especializado p/ trabalhar com valores primitivos) com os valores primitivos
                .filter(n -> n > 5)
                .average();

        System.out.println(media.getAsDouble());


    }
}
