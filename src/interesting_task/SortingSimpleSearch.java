package interesting_task;

public class SortingSimpleSearch {
    public static void main(String[] args) {
//        int[] array = {2, 1, 3};
//        todo from low to high and vice versa
        int[] mas = {3, 2, 1, 2, 9, 4};

        for (int i = 0; i < mas.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[indexMin] > mas[j]) {

                    indexMin = j;
//                    int temp = mas[i];
//                    mas[i] = mas[j];
//                    mas[j] = temp;

                }
            }
            if (indexMin != i && mas[indexMin] != mas[i]) {
                int tmp = mas[i];
                mas[i] = mas[indexMin];
                mas[indexMin] = tmp;
            }

            for (int mass : mas) {
                System.out.print(mass + " ");
            }
            System.out.println();

        }
    }
}
