package lab4;

public class Cosmetics implements Comparable<Cosmetics> {
    private int cost;
    private String brand;
    private int volume;
    private int qualityLevel;
    private String manufacturerCountry;

    public Cosmetics(int cost, String brand, int volume, int qualityLevel, String manufacturerCountry) {
        this.cost = cost;
        this.brand = brand;
        this.volume = volume;
        this.qualityLevel = qualityLevel;
        this.manufacturerCountry = manufacturerCountry;
    }



    @Override
    public String toString() {
        return "Cosmetics{" +
                "cost=" + cost +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                ", qualityLevel=" + qualityLevel +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                "}\n";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    /*@Override
    public int compareTo(Object o) {
        return 0;
    }*/

    @Override
    public int compareTo(Cosmetics o) {
//        return /*this.*/cost - o.cost;
        /*if (cost < o.cost) {
            return -1;
        } else {
            if (cost > o.cost) {
                return 1;
            } else {
                return 0;
            }
        }*/
        int compareResult = Integer.compare(cost, o.cost);
        return compareResult != 0 ? compareResult : o.brand.compareTo(brand);
    }
}
