package lab4;

public class Cosmetics {
    private int cost;
    private String brand;
    private int volume;
    private int qualityLevel;
    private String manufacturerCountry;

    public Cosmetics(int cost, String brand, int volume, int qualityLevel, String manufacturerCountry) {
        this.cost = cost;
        this.brand = brand;
        this.volume = volume;
        this.qualityLevel = qualityLevel;
        this.manufacturerCountry = manufacturerCountry;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "cost=" + cost +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                ", qualityLevel=" + qualityLevel +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                "}\n";
    }
}
