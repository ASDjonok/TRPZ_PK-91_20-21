package _11_Панаско_Денис_Віталійович;

public class Lab1 {
    public static void main(String[] args){
        System.out.println(myMethod(1982));

    }

    static String myMethod(int z){ //z №зачетки
        int C2 = z%2;
        int C3 = z%3;
        int C5 = z%5;
        int C7 = z%7;
        final int c = C3;
        final int a = -200;
        final int b = 3;
        final int n = -1;
        final int m = 70;
        double SUM = 0.0;

        if (a > n) {
            System.out.println("The upper limit cannot be less than the lower limit of algebraic sum (a > n)");
            java.lang.System.exit(1);
        }
        if (c >= a && c <= n) {
            System.out.println("Constant 'c' can't be in range [a;n] (Division by zero when i == c in second 'for' block)");
            System.exit(1);
        }
        if (b > m) {
            System.out.println("The upper limit cannot be less than the lower limit of algebraic sum (b > m)");
            java.lang.System.exit(1);
        }

        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                SUM += ((double) (i * j)) / (i - c);
            }
        }



        return "C2 = "+C2+"\nC3 = "+C3+"\nC5 = "+C5+"\nC7 = "+C7+"\nS = "+SUM;

    }
}
