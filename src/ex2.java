//import java.lang.Math;

public class ex2 {
    public static void main(String[] args) {

        // №2
        // 9165
        // c5 = 0
        // c7 = 2
        // с11 = 2

        final byte a = 2; // Константа яка фігурує у операції із матрицею
        final byte heightOfArray = 10;
        final byte wideOfArray = 10;
        final byte maxOfValuesInMass = 100;  // Максимальне значення числа у одній комірці матриці (тобто генерування значень у діапазоні [1-100])
        short[][] array = new short[heightOfArray][wideOfArray];

        // Генерація та вивід матриці
        System.out.printf("Згенерована матриця розмірністю %d на %d:\n", heightOfArray, wideOfArray);
        for (byte i = 0; i < heightOfArray; i++) {
            for (byte j = 0; j < wideOfArray; j++) {
                array[i][j] = (short) (Math.random() * maxOfValuesInMass + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        // Оброблюємо та виводимо матрицю
        System.out.printf("Матриця після операції (C=a×B, де a - const)(a = %d):\n", a);
        for (byte i = 0; i < heightOfArray; i++) {
            for (byte j = 0; j < wideOfArray; j++) {
                array[i][j] *= a;
                System.out.print(array[i][j] + "  ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        // "Транспонуємо" матрицю і шукаємо максимальні значення рядків, сумуємо їх до змінної sumMaxOfColumns
        short sumMaxOfColumns = 0;

        for (short i = 0, max; i < wideOfArray; i++) {
            max = array[0][i];
            for (byte j = 0; j < heightOfArray; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
            }
            sumMaxOfColumns += max;
        }
        System.out.println("Сума максимальних значень стовпців = " + sumMaxOfColumns);
    }
}
