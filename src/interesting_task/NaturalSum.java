package interesting_task;

public class NaturalSum {
    public static void main(String[] args) {
//        count sum of n first natural numbers
//        n = 1;
//        n = 5;
//        while, for, if
        int sum = 0;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
