package _13_Пітух_Ілля_Олександрович.lab6;

import java.util.Arrays;

public class Salad {
    private Vegetable[] vegetables;

    public Salad(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public void sort() {
        Arrays.sort(vegetables);
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables=" + Arrays.toString(vegetables) +
                '}';
    }
}
