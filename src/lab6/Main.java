package lab6;

public class Main {
    public static void main(String[] args) {

        Flower flower = new Rose(1, 5);

        System.out.println(flower/*.toString()*/);

        flower = new Chamomile(1, 2);

        System.out.println(flower/*.toString()*/);

        System.out.print("Done!");
    }
}
