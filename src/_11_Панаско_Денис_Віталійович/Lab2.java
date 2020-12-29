package _11_Панаско_Денис_Віталійович;

public class Lab2 {
    public static void main(String[] args){
        int z = 9165;
        int C5 = z%5;
        int C7 = z%7;
        int C11 = z%11;

        System.out.println("C5 = "+C5+"\nC7 = "+C7+"\nC11 = "+C11);

        final byte a = 2;
        final byte y = 4;
        final byte x = 4;
        final byte maxOfValuesInMass = 100;
        short[][] array = new short[y][x];

        System.out.printf("Згенерована матриця розмірністю %d на %d:\n", y, x);
        for (byte i = 0; i < y; i++) {
            for (byte j = 0; j < x; j++) {
                array[i][j] = (short) (Math.random() * maxOfValuesInMass + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.print('\n');
        }
        System.out.print('\n');


        System.out.printf("Матриця після операції (C=a×B, де a - const)(a = %d):\n", a);
        for (byte i = 0; i < y; i++) {
            for (byte j = 0; j < x; j++) {
                array[i][j] *= a;
                System.out.print(array[i][j] + "  ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        short sumMaxOfColumns = 0;

        for (short i = 0, max; i < x; i++) {
            max = array[0][i];
            for (byte j = 1; j < y; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
            }
            sumMaxOfColumns += max;
        }
        System.out.println("Сума максимальних значень стовпців = " + sumMaxOfColumns);
    }
}
