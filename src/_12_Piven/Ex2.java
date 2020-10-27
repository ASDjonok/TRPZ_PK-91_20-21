package _12_Piven;

public class Ex2 {
    public static void main(String[] args) {

        // №7112
        // c5 = 0
        // c7 = 2
        // с11 = 2

        final byte a = 2;
        final byte heightOfArray = 10;
        final byte widthOfArray = 10;
        final byte maxOfValuesInMass = 100;  //діапазон [1-100]
        short[][] array = new short[heightOfArray][widthOfArray];

        System.out.printf("Згенерована матриця розмірністю %d на %d:\n", heightOfArray, widthOfArray);
        for (byte i = 0; i < heightOfArray; i++) {
            for (byte j = 0; j < widthOfArray; j++) {
                array[i][j] = (short) (Math.random() * maxOfValuesInMass + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        System.out.printf("Матриця після операції (C=a×B, де a - const)(a = %d):\n", a);
        for (byte i = 0; i < heightOfArray; i++) {
            for (byte j = 0; j < widthOfArray; j++) {
                array[i][j] *= a;
                System.out.print(array[i][j] + "  ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        short sumMaxOfColumns = 0;

        for (short i = 0, max; i < widthOfArray; i++) {
            max = array[0][i];
            for (byte j = 1; j < heightOfArray; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
            }
            sumMaxOfColumns += max;
        }
        System.out.println("Сума максимальних значень стовпців = " + sumMaxOfColumns);
    }
}
