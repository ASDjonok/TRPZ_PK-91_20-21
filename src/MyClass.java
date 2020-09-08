public class MyClass implements Comparable {
    public static void main(String[] args) {
        System.out.println("Done!2");
        System.out.println(args[0]);
        System.out.println(new MyClass().myMethod());

        char a = 'b';
        char b = 'a';
        System.out.println(a);
        System.out.println((short)a);
        System.out.println(b);
        System.out.println((int)b);
        System.out.println(a+b);

        for (double i = 0.1; i < 0.2; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("ints division:" + ((double)1/2));
    }

    /*static*/ int myMethod() {
        return 1;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
