public class Lab2 {
    public static void main(String[] args) {

//        int[] array = new int[4];
        int[] array = {2, 3};

//        array[0] = 2;
        System.out.println(array[0]);

//        int[][] ma = new int[3][4];
        int[][] ma = {
                {1, 2},
                {3, 4, 7},
                {5, 6},
        };

        ma[0][0] = 1;

        System.out.println(ma[0][0]);
        System.out.println("length = " + ma.length);
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {

            }
        }

        System.out.println("Done!");
    }
}
