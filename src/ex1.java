public class ex1 {
    public static void main(String[] args) {

        // №1
        // 9165
        // c2 = 1
        // c3 = 0
        // c5 = 0
        // c7 = 2

        final byte c = 1;     // Константа "С" [0;2]
        final int a = -200;      // Нижня межа зовнішньої алгебраїчної суми
        final int b = 3;      // Верхня межа зовнішньої алгебраїчної суми
        final int n = -1;    // Нижня межа внутрішньої алгебраїчної суми
        final int m = 70;   // Верхня межа внутрішньої алгебраїчної суми
        double sum = 0.0; // Значення суми

        if (a > n) {
            System.out.println("The upper limit cannot be less than the lower limit of algebraic sum (a > n)");
            java.lang.System.exit(-1);
        }
        if (c >= a && c <= n) {
            System.out.println("Constant 'c' can't be in range [a;n] (Division by zero when i == c in second 'for' block)");
            System.exit(-1);
        }
        if (b > m) {
            System.out.println("The upper limit cannot be less than the lower limit of algebraic sum (b > m)");
            java.lang.System.exit(-1);
        }

        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                sum += ((double) (i * j)) / (i - c); //  Якщо i == c то тоді відбудеться помилка викликана діленням на нуль
            }
        }
        System.out.println("S = " + sum);
    }
}
