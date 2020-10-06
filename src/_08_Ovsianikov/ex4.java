package _08_Ovsianikov;

import java.util.Arrays;
import java.util.Comparator;

// №4
// 9165
// с11 = 2

class Car {

    /*static final String[] MODELS = new String[]{"Nissan", "Porsche", "Audi", "Hyundai", "Ford",
            "Volkswagen", "Honda", "BMW", "Mercedes-Benz", "Toyota"};*/


    private int personalNumber;
    private int price;
    private Model model;
    private int maxSpeed;
    private int weight;
    private boolean hasOpenedRoof;

    public Car() {
        this.personalNumber = (int) (Math.random() * 10000 + 1); // [1-9999]
        this.price = (int) (Math.random() * 1000000 + 50000); // [1-1050000]
        this.model = MODELS[(int) (Math.random() * 11 - 1)];  // [0-10]
        this.maxSpeed = (int) (Math.random() * 500 + 1); // [1-500];
        this.weight = (int) (Math.random() * 100 + 1); // [1-100];
        this.hasOpenedRoof = ((Math.random() - 0.5) > 0); // [0-1];
    }

    // Setter-и
    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHasOpenedRoof(Boolean hasOpenedRoof) {
        this.hasOpenedRoof = hasOpenedRoof;
    }

    // Getter-и
    public int getPersonalNumber() {
        return this.personalNumber;
    }

    public int getPrice() {
        return this.price;
    }

    public String getModel() {
        return this.model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getWeight() {
        return this.weight;
    }

    public Boolean getHasOpenedRoof() {
        return this.hasOpenedRoof;
    }

    public String getInfo() {
        return "personalNumber: " + this.personalNumber + "\n" +
                "price: " + this.price + "\n" +
                "model: " + this.model + "\n" +
                "speed: " + this.maxSpeed + "\n" +
                "weight: " + this.weight + "\n" +
                "hasOpenedRoof: " + this.hasOpenedRoof + "\n\n";
    }
}

class CarPersonalNumberComparator implements Comparator<Car> {

    public int compare(Car a, Car b) {
        return Integer.compare(a.getPersonalNumber(), b.getPersonalNumber());
    }
}

class CarPriceComparator implements Comparator<Car> {

    public int compare(Car a, Car b) {
        return Integer.compare(b.getPrice(), a.getPrice());  // по спаданню (переставили аргументи метода compare())
    }
}

class CarModelComparator implements Comparator<Car> {

    public int compare(Car a, Car b) {
        return a.getModel().compareTo(b.getModel());
    }
}

class CarMaxSpeedComparator implements Comparator<Car> {

    public int compare(Car a, Car b) {
        return Integer.compare(a.getMaxSpeed(), b.getMaxSpeed());
    }
}

class CarWeightComparator implements Comparator<Car> {

    public int compare(Car a, Car b) {
        return Integer.compare(a.getWeight(), b.getWeight());
    }
}

class CarHasOpenedRoofComparator implements Comparator<Car> {

    public int compare(Car a, Car b) {
        return Boolean.compare(b.getHasOpenedRoof(), a.getHasOpenedRoof());
    }
}

public class ex4 {
    public static void main(String[] args) {

        Car[] arr = new Car[]{new Car(), new Car(), new Car(), new Car(), new Car(), new Car()};

        Comparator<Car> carComp = new CarPersonalNumberComparator().thenComparing(new CarPriceComparator()).thenComparing(new CarModelComparator()).thenComparing(new CarMaxSpeedComparator()).thenComparing(new CarWeightComparator()).thenComparing(new CarHasOpenedRoofComparator());

        for (Car car : arr) {
            System.out.print(car.getInfo());
        }

        Arrays.sort(arr, carComp);
        System.out.println("======== Оброблений масив =======\n");

        for (Car car : arr) {
            System.out.print(car.getInfo());
        }
    }
}
