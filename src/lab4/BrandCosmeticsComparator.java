package lab4;

import java.util.Comparator;

public class BrandCosmeticsComparator implements Comparator<Cosmetics> {
    @Override
    public int compare(Cosmetics o1, Cosmetics o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
