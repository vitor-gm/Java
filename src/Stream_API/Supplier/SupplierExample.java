package Stream_API.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá";

        //Obtendo várias saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();
        listaSaudacoes.forEach(System.out::println);

        //Lambda
        Stream.generate(saudacao)
                .limit(5)
                .toList()
                .forEach(System.out::println);





    }
}
