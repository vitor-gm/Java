package Collections.Map.Ordenacao.Ex2;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {


    @Override
    public int compare(Map.Entry<String, Livro> p1, Map.Entry<String, Livro> p2) {
        return Double.compare(p1.getValue().getPreco(), p2.getValue().getPreco());
    }
}
