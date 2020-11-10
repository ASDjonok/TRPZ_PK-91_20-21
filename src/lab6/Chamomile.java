package lab6;

public class Chamomile extends Flower {
    private int petalQuantity;

    /*public Chamomile(int freshness) {
        super(freshness);
    }*/

    public Chamomile(int freshness, int petalQuantity) {
        super(freshness);
        this.petalQuantity = petalQuantity;
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "petalQuantity=" + petalQuantity +
                ", freshness=" + getFreshness() +
                '}';
    }
}
