package lab7;

import lab6.Flower;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection/*<Flower>*/ myCollection = new MyCollection();
        myCollection.add(new Flower(1));
        myCollection.add(new Flower(2));
        for (int i = 0; i < 14; i++) {
            myCollection.add(new Flower(i + 3));
        }

        /*Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        for (Object o : myCollection) {
            System.out.println(o);
        }

//        Flower flower = myCollection.set(0, new Flower(1));
//        Flower flower = myCollection.set(0, new Object());
    }
}
