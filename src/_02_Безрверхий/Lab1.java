package _02_Безрверхий;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int recordBook = 26347;
        int c2, c3, c5, c7;
        final int C;
        float i, j, n, m;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        c2 = recordBook % 2;
        System.out.println(c2 + " - c2 ");
        c3 = recordBook % 3;
        System.out.println(c3 + " - c3");
        c5 = recordBook % 5;
        System.out.println(c5 + " - c5");
        c7 = recordBook % 7;
        System.out.println(c7 + " - c7");
        System.out.println("Введи i: ");
        i = input.nextInt();
        n = i - 1;
        while ((n <= i)) {
            System.out.print("Введи n (число n должно быть больше i): ");
            n = input.nextInt();
        }
        System.out.println("Введи j: ");
        j = input.nextInt();
        m = j - 1;
        while ((m <= j)) {
            System.out.println("Введи m(число m должно быть больше j):) ");
            m = input.nextInt();
        }

        C = c3;
        if (i <= -C && -C <= n) {
            System.err.println("деление на 0!!!\nв знаменателе ...");
            System.exit(0);

        }
        if (j <= 0 && 0 <= m) {
            System.err.println("деление на 0!!!\nв числителе...");
            System.exit(0);
        } else {
            for (; i <= n; i++) {
                for (; j <= m; j++) {
                    sum += (i / j) / (i + C);
                }
            }
        }

        System.out.println(sum + "= сумма");
    }
}
