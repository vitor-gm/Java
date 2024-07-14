package Stream_API.Pratica;

import java.util.Arrays;
import java.util.List;

public class TodosIguais {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 1 , 1);

        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;

        if(todosIguais) {
            System.out.println("Todos os numeros são iguais!");
        }else {
            System.out.println("Os números são diferentes!");
        }




    }
}
