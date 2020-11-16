package test;

public class OuterClass {
    int a;
    public /*static*/ class InnerClass {
        /*public static void main(String[] args) {
            new OuterClass().a = 1;
            System.out.println("Done!");
        }*/
    }

    /*static*/ void myStaticMethod() {

    }
}

class OuterClass2 {
    public static void main(String[] args) {
        System.out.println("Done!2");
        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = new outerClass.InnerClass();

//        OuterClass.myStaticMethod();
    }
}
