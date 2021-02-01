import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        SuchAWonderfulSet<String> sett = new SuchAWonderfulSet<>();
        sett.add("0");
        sett.add("1");
        sett.add("2");
        sett.add("3");
        System.out.println(sett.toString());
        sett.remove("3");
        for (String a: sett.toArray(new String[0])) {
            System.out.println(a);
        }
        System.out.println("----------------");
        String[] k = new String[6];
        k[0] = "t";
        for (String a: sett.toArray(k)) {
            System.out.println(a);
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("yyyyy");
        System.out.println(sett.toString());
        sett.retainAll(arr);
        System.out.println(sett.toString());
        sett.clear();
        System.out.println(sett.toString());
    }
}
