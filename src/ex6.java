import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// №6
    // 9165
    // с13 = 0;

class Flower implements Comparable<Flower> {

    private String colour;
    private int price;
    private int[] freshness; // у форматі дати (19.10.2019)
    public String species;
    private int length;

    public Flower(String colour, int price, String freshness, int length, String species) {
        this.colour = colour;
        this.price = price;
        this.freshness = transformDateToInt(freshness);
        this.species = species;
        this.length = length;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public String getFreshness() {
        return freshness[0] + "." + freshness[1] + "." + freshness[2];
    }

    public int getLength() {
        return length;
    }

    public static int[] transformDateToInt(String date) {
        if (date.length() != 10)
            throw new Error("Date must be in correct format - dd.mm.yyyy");
        date = "." + date;
        int num = 0;
        int[] intDate = new int[3];
        for (int i = 10 , j = 2, k = 0; i >= 0; i--) {
            if (date.charAt(i) != '.') {
                int indexOfDigit = date.codePointAt(i);
                if (indexOfDigit >= 48 && indexOfDigit <= 57) { // числа 0-9
                    num += switch (indexOfDigit) {
                        case 48 -> 0;
                        case 49 -> 1 * Math.pow(10, k);
                        case 50 -> 2 * Math.pow(10, k);
                        case 51 -> 3 * Math.pow(10, k);
                        case 52 -> 4 * Math.pow(10, k);
                        case 53 -> 5 * Math.pow(10, k);
                        case 54 -> 6 * Math.pow(10, k);
                        case 55 -> 7 * Math.pow(10, k);
                        case 56 -> 8 * Math.pow(10, k);
                        case 57 -> 9 * Math.pow(10, k);
                        default -> -1;
                    };
                    k++;
                }
                else {
                    throw new Error("Date format has non-common symbol(s)");
                }
            }
            else {
                intDate[j] = num;
                num = 0;
                j--;
                k = 0;
            }
        }
        return intDate;
    }

    @Override
    public String toString() {
        return species + ":\n" +
                "colour : " + colour + "\n" +
                "cost : " + price + "\n" +
                "freshness : " + getFreshness() + "\n" +
                "length : " + length + "\n";
    }

    public int compareTo(Flower anotherFlower) {

        if(freshness[2] > anotherFlower.freshness[2])
            return 1;
        else if(freshness[2] < anotherFlower.freshness[2])
            return -1;
        if(freshness[1] > anotherFlower.freshness[1])
            return 1;
        else if(freshness[1] < anotherFlower.freshness[1])
            return -1;
        return Integer.compare(freshness[0], anotherFlower.freshness[0]);
    }
}

class FlowerLengthComparator implements Comparator<Flower> {
    public int compare(Flower a, Flower b) {
        return Integer.compare(a.getLength(), b.getLength());
    }
}

class Rose extends Flower {

    public Rose(String colour, int price, String freshness, int length) {
        super(colour, price, freshness, length, "Rose");
    }
}

class Carnation extends Flower {

    public Carnation(String colour, int price, String freshness, int length) {
        super(colour, price, freshness, length, "Carnation");
    }
}


class Tulip extends Flower {

    public Tulip(String colour, int price, String freshness, int length) {
        super(colour, price, freshness, length, "Tulip");
    }
}


class Narcissus extends Flower {

    public Narcissus(String colour, int price, String freshness, int length) {
        super(colour, price, freshness, length, "Narcissus");
    }
}

class Peonies extends Flower {

    public Peonies(String colour, int price, String freshness, int length) {
        super(colour, price, freshness, length, "Narcissus");
    }
}

class Accessory {

    private String name;
    private String material;
    private int price;

    public Accessory(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ":\n" +
                "material : " + material + "\n" +
                "cost : " + price + "\n";
    }
}

class Bouquet {

    private static int count = 1;

    private int number;
    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        Arrays.sort(flowers);
        this.flowers = flowers;
        this.accessories = accessories;
        number = Bouquet.count;
        Bouquet.count++;
    }

    public int getPrice() {
        int sum = 0;
        for (Flower flower: flowers) {
            sum += flower.getPrice();
        }
        for (Accessory accessory: accessories) {
            sum += accessory.getPrice();
        }
        return sum;
    }

    public Flower[] getFlowersInSpecificRangeOfLength(int lowerRange, int upperRange) {
        ArrayList<Flower> flowersInRange = new ArrayList<>();
        int len;
        int count = 0;
        for (Flower flower: flowers) {
            len = flower.getLength();
            if (len >= lowerRange && len <= upperRange) {
                flowersInRange.add(flower);
                count++;
            }
        }
        if (flowersInRange.size() != 0)
            return flowersInRange.toArray(new Flower[count]);
        else
            return new Flower[1];
    }

    @Override
    public String toString() {
        StringBuilder infAboutBouquet = new StringBuilder();
        for (Flower flower: flowers) {
            infAboutBouquet.append(flower.toString());
        }
        for (Accessory accessory: accessories) {
            infAboutBouquet.append(accessory.toString());
        }
        return "Bouquet №" + number + " :\n[" + infAboutBouquet + "]";
    }
}

public class ex6 {

    public static String rgb(int r, int g, int b) {
        if (!((r > -1 && r < 256) || (g > -1 && g < 256) || (b > -1 && b < 256)))
            throw new Error("Colour must be in range [0-255]");
        String hex = "0x";
        int integer, mod;
        for (int val: (new int[] {r, g, b})) {
            int[] integerAndMod = {val / 16, val % 16};
            for (Integer val2: integerAndMod) {
                if (val2 > 15)
                    throw new Error("Unexpected error: " + val2);
                if (val2 <= 9) {
                    hex = hex.concat(val2.toString());
                    continue;
                }
                hex = switch (val2) {
                    case 10 -> hex.concat("A");
                    case 11 -> hex.concat("B");
                    case 12 -> hex.concat("C");
                    case 13 -> hex.concat("D");
                    case 14 -> hex.concat("E");
                    case 15 -> hex.concat("F");
                    default -> null;
                };
            }
        }
        return hex;
    }

    public static void main(String[] args) {

        Flower[] flowers = {new Rose(rgb(218, 112, 214),100, "19.10.2020", 5),
                            new Carnation(rgb(200, 100, 250),50,"18.11.2020", 12),
                            new Tulip(rgb(120, 30, 60),80,"20.10.2019", 9),
                            new Narcissus(rgb(45, 76, 11),150,"10.10.2020", 24),
                            new Peonies(rgb(97, 99, 199),200,"01.10.2020", 27)};

        Accessory[] accessories = {new Accessory("Butterfly", "plastic", 15),
                                   new Accessory("Rhinestones", "plastic", 5),
                                   new Accessory("Wrapper", "plastic", 10)};

        Bouquet bouquet = new Bouquet(flowers, accessories);

        System.out.println("Price of bouquet: " + bouquet.getPrice());

        System.out.println(bouquet);

        for (Flower flower: bouquet.getFlowersInSpecificRangeOfLength(10,25)) {
            System.out.println(flower);
        }
    }
}
