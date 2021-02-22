package interesting_task;

public class SortingBubble {
    public static void main(String[] args) {
        int[] mas = {8, 2, 7, 6, 1};
        int temp = 0;
        boolean flag = true;
        for (int i = 1; i < mas.length && flag; i++) {
            flag = false;
            for (int j = 0; j < mas.length - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    temp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = temp;
                    flag = true;
                }
            }

            System.out.println("i = " + i);
            for (int mass : mas) {
                System.out.print(mass + " ");
            }
            System.out.println();

        }
    }
}
