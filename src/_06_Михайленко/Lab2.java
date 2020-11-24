package _06_Михайленко;

public class Lab2 {
    public static void output(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%10d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final byte n = 3;
        final int Book = 2222;
        byte c11, c5, c7;
        int sum = 0, min;
        c5 = Book % 5;
        System.out.println(c5 + " - c5");
        c7 = Book % 7;
        System.out.println(c7 + " - c7");
        c11 = Book % 11;
        System.out.println(c11 + " - c11");

        int matrixA[][] = {
                {2222, 4, 999},
                {8, 1, 8},
                {6, 6, 1}
        };
        System.out.println("массив А");
        output(matrixA);
        int matrixB[][] = {
                {1, 6, 2},
                {3, 1, 1},
                {8, 1, 1}};
        System.out.println("массив B");
        output(matrixB);

        int matrixC[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("массив C");
        output(matrixC);
        for (int i = 0; i < n; i++) {
            min = matrixC[0][i];
            for (int j = 1; j < n; j++) {
                if (min > matrixC[j][i]) {
                    min = matrixC[j][i];
                }
            }
            sum += min;
        }

        System.out.println("сумму наименьших элементов каждого столбца матрицы = " + sum);

    }
}
