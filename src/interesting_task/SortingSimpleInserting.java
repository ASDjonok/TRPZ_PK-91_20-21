package interesting_task;

import java.util.Arrays;

public class SortingSimpleInserting {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 4, 1};
//        5, 4, 3, 4, 1 (4)
//        5, 5, 3, 4, 1 (4)
//        4, 5, 3, 4, 1 (4)

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > current) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = current;
            System.out.println(Arrays.toString(array));
        }
    }
}
