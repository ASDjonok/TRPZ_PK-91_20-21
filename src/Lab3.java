public class Lab3 {
    public static void main(String[] args) {
        System.out.println(new String("Done!"));
        System.out.println("Done!");

//        String string = "Done!";
        String string = "Done!";
        String string2 = "Done!";
        System.out.println(string);
        System.out.println(string.length());

        StringBuilder stringBuilder = new StringBuilder("1"); //не синхронизируется, (им)мутабл ((im)mutable), не имеет иквалс
        StringBuilder stringBuilder2 = new StringBuilder("1"); //не синхронизируется, (им)мутабл ((im)mutable), не имеет иквалс
        System.out.println("stringBuilder.equals(stringBuilder2): " + stringBuilder.equals(stringBuilder2));
        System.out.println(stringBuilder);
        stringBuilder.append(1);
        System.out.println(stringBuilder);
        /*final*/ int a = 1;
        a = 2;

        int b = 2;

        System.out.println(1 == 1);
        System.out.println(a == b);
        System.out.println(string);
        System.out.println(string2);
        System.out.println(string == string2);
        System.out.println(string.equals(string2));
        System.out.println(string.hashCode());
        System.out.println(string2.hashCode());

        String s = "ASD";
        String s2 = s;
        s += "QWERTY";
        System.out.println(s);
        System.out.println(s2);

        StringBuilder stringBuilder3 = new StringBuilder("ASD");
        stringBuilder3.append("QWERTY");
        System.out.println(stringBuilder3);
    }
}
