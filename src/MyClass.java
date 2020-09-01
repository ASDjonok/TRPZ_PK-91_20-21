public class MyClass {
    public static void main(String[] args) {
        System.out.println("Done!2");
        System.out.println(args[0]);
        System.out.println(new MyClass().myMethod());
    }

    /*static*/ int myMethod() {
        return 1;
    }
}
