package lab7;

import lab6.Flower;

public class Main {
    public static void main(String[] args) {
        MyCollection/*<Flower>*/ myCollection = new MyCollection();
        myCollection.add(new Flower(1));
//        Flower flower = myCollection.set(0, new Flower(1));
//        Flower flower = myCollection.set(0, new Object());
    }
}
