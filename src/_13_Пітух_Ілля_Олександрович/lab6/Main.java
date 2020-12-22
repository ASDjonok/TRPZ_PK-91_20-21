package _13_Пітух_Ілля_Олександрович.lab6;

public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad(new Vegetable[]{
            new Carrot(1),
            new Cucumber(2),
            new Potato(3),
            new Carrot(1),
            new Carrot(1),
            new Carrot(1),
        });

        System.out.println(salad);
        salad.sort();
        System.out.println(salad);
    }
}
