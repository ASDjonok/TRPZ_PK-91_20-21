package lab6;

public class Flower {
    private /*protected*/ int freshness;

    public Flower(int freshness) {
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "freshness=" + freshness +
                '}';
    }
}
