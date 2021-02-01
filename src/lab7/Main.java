package lab7;

import lab6.Flower;

public class Main {
    public static void main(String[] args) {
        MyList/*<Flower>*/ myList = new MyList();
        myList.add(new Flower(1));
        myList.add(new Flower(2));
        for (int i = 0; i < 14; i++) {
            myList.add(new Flower(i + 3));
        }

        /*Iterator iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        for (Object o : myList) {
            System.out.println(o);
        }

//        Flower flower = myCollection.set(0, new Flower(1));
//        Flower flower = myCollection.set(0, new Object());

        MySet mySet = new MySet();
        mySet.add(new Flower(1));
        mySet.add(new Flower(2));
    }
}
