package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Lab4 lab4 = new Lab4();
        lab4.*/

//        Cosmetics cosmetics = new Cosmetics();

        /*Cosmetics[] cosmeticsArray = new Cosmetics[5];
        cosmeticsArray[0] = cosmetics;
        cosmeticsArray[1] = new Cosmetics();
        cosmeticsArray[2] = new Cosmetics();
        cosmeticsArray[3] = new Cosmetics();
        cosmeticsArray[4] = new Cosmetics();*/

        Cosmetics[] cosmeticsArray = {
                new Cosmetics(1, "L'Oreal Paris 1", 10, 10, "France"),
                new Cosmetics(1, "L'Oreal Paris 5", 1, 10, "France"),
                new Cosmetics(2, "L'Oreal Paris 3", 5, 10, "France"),
                new Cosmetics(6, "L'Oreal Paris 123", 6, 10, "France"),
                new Cosmetics(4, "L'Oreal Paris 5", 3, 10, "France"),
                new Cosmetics(1, "L'Oreal Paris 4", 2, 10, "France"),
        };


//        cosmeticsArray[0].setCost(2);
        cosmeticsArray[0].setCost(Integer.MIN_VALUE);
        System.out.println("\u001B[35m" + "UnSorted array: \n"  + Arrays.toString(cosmeticsArray));
//        System.out.println(cosmeticsArray[0].getCost());

        Arrays.sort(cosmeticsArray);
        System.out.println("\u001B[35m" + "Sorted with Comparable: \n" + Arrays.toString(cosmeticsArray));

//        MyComparator myComparator = new MyComparator();

//        System.out.println(cosmeticsArray[0].compareTo(cosmeticsArray[1]));
//        cosmeticsArray[0].cost = 1;

//        System.out.println(cosmetics);
        Arrays.sort(cosmeticsArray, new CostCosmeticsComparator().reversed());
        System.out.println("Sorted with reversed CostCosmeticsComparator: \n" + Arrays.toString(cosmeticsArray));

        Arrays.sort(cosmeticsArray, new BrandCosmeticsComparator());
        System.out.println("Sorted with BrandCosmeticsComparator: \n" + Arrays.toString(cosmeticsArray));
    }
}
