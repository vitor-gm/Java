package Collections.Queue.Ex2;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getPreco() > p2.getPreco() ? 1 : -1;
    }
}
