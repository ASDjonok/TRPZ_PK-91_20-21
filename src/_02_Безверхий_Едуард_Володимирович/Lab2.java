package _02_Безверхий_Едуард_Володимирович;

public class Lab2 {
    public static void main(String[] args) {
        int recordBook = 26347;
        final byte n = 3;
        byte[][] mass_A = {
                {1, 9, 3},
                {7, 5, 6},
                {0, 8, 14}
        };
        byte MAS_T[][] = new byte[n][n];
        int c11, c5, c7;
        byte sum = 0, min;

        c5 = recordBook % 5;
        System.out.println(c5 + " - c5");
        c7 = recordBook % 5;
        System.out.println(c7 + " - c7");
        c11 = recordBook % 5;
        System.out.println(c11 + " - c11");

        // создание транспонированной матрицы A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                MAS_T[i][j] = mass_A[j][i];
            }
        }

        // вывод на экран матрицу A
        System.out.println("начальная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", mass_A[i][j]);
            }
            System.out.println();
        }

        // вывод на экран транспонированной матрицы A
        System.out.println("транспонированная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", MAS_T[i][j]);
            }
            System.out.println();
        }
        // поиск  минимальных чисел в рядках и их сумма
        for (int i = 0; i < n; i++) {
            min = MAS_T[i][0];
            for (int j = 1; j < n; j++) {
                if (MAS_T[i][j] < min) {
                    min = MAS_T[i][j];
                }
            }
            sum += min;
        }
        System.out.println("сумма минимальных элементов рядка матрицы = " + sum);
    }
}
