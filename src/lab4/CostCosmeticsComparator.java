package lab4;

import java.util.Comparator;

public class CostCosmeticsComparator implements Comparator<Cosmetics> {
    @Override
    public int compare(Cosmetics o1, Cosmetics o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
}
