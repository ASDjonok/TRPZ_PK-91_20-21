package _13_Пітух_Ілля_Олександрович.lab6;

public class Vegetable implements Comparable<Vegetable> {
    private int calorieContent;

    public Vegetable(int calorieContent) {
        this.calorieContent = calorieContent;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "calorieContent=" + calorieContent +
                '}';
    }

    @Override
    public int compareTo(Vegetable o) {
        return Integer.compare(calorieContent, o.calorieContent);
    }
}
