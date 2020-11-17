package test;

//import test.OuterClass.InnerClass;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        OuterClass outerClass = new OuterClass();
//        InnerClass innerClass = outerClass.new InnerClass();
        /*InnerClass innerClass = */outerClass.new InnerClass();
//        System.out.println(innerClass);
//        System.out.println(Class.forName("outerClass.InnerClass").newInstance());
//        InnerClass();
    }
}
