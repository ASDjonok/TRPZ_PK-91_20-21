package lab6;

public class Rose extends Flower {
    private int spikesQuantity;

    /*public Rose(int freshness) {
        super(freshness);
    }*/

    public Rose(int freshness, int spikesQuantity) {
        super(freshness);
        this.spikesQuantity = spikesQuantity;
    }

    /*void myMethod() {
        new Flower().freshness = 1;
    }*/

    @Override
    public String toString() {
        return "Rose{" +
                "spikesQuantity=" + spikesQuantity +
                ", freshness=" + getFreshness() +
                '}';
    }


}
