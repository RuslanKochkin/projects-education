import java.util.Comparator;

public class SortByTax implements Comparator<RealProperty> {

    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return Double.compare(o1.property(), o2.property());
    }
}
