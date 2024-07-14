package Stream_API.Pratica;

import java.util.Arrays;
import java.util.List;

public class SomarDigitos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .flatMapToInt(n -> String.valueOf(n).chars().map(Character::getNumericValue))
                .sum();

        System.out.println("Soma dos dígitos: " + soma);


    }
}
