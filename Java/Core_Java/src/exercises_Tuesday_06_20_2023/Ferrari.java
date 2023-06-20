package exercises_Tuesday_06_20_2023;

public class Ferrari extends Car {
    public Ferrari(String color, int topSpeed, String model, String upgrades) {
        super(color, topSpeed, model, upgrades);
    }
    
    public void features(int year) {
        features();
        System.out.println("Year: " + year);
    }
    
    public void features(double price) {
        features();
        System.out.println("Price: $" + price);
    }
    
    public void features(int year, double price) {
        features();
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}