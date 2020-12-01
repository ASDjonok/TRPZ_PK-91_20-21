package _04_Коваль_Назарій_Васильович;

public class Laba2 {
    public static void main(String[] args) {
        int CreditBookNumber = 9680;
        System.out.println(CreditBookNumber + " Мій номер ");
        int c5 = CreditBookNumber % 5;
        System.out.println(c5);
        int c7 = CreditBookNumber % 7;
        System.out.println(c7);
        int c11 = CreditBookNumber % 11;
        System.out.println(c11);

        /*int[][] matrixB;
        matrixB = new int[2][3];
        matrixB[0][0] = 1;
        matrixB[0][1] = -2;
        matrixB[0][2] = 3;
        matrixB[1][0] = 4;
        matrixB[1][1] = 1;
        matrixB[1][2] = 7;*/

        int[][] matrixB = {
                {1, -2, 3},
                {4, 1, 7, 65}
        };

        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {*/
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        int a = 2;
        int[][] matrixC;
//        matrixC = new int[2][3];
//        matrixC = new int[matrixB.length][matrixB[0].length];
        matrixC = new int[matrixB.length][];
        /*{
            {?, ?, ?},
            {?, ?, ?, ?}
        }*/
        /*matrixC[0][0] = matrixB[0][0] * a;
        matrixC[0][1] = matrixB[0][1] * a;
        matrixC[0][2] = matrixB[0][2] * a;
        matrixC[1][0] = matrixB[1][0] * a;
        matrixC[1][1] = matrixB[1][1] * a;
        matrixC[1][2] = matrixB[1][2] * a;*/

        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {*/
        for (int i = 0; i < matrixB.length; i++) {
            matrixC[i] = new int[matrixB[i].length];
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixC[i][j] = matrixB[i][j] * a;
            }
        }

        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {*/
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

