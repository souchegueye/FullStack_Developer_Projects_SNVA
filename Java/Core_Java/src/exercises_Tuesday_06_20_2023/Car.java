package exercises_Tuesday_06_20_2023;

public class Car {
    private String color;
    private int topSpeed;
    private String model;
    private String upgrades;
    
    public Car(String color, int topSpeed, String model, String upgrades) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.model = model;
        this.upgrades = upgrades;
    }
    
    public void features() {
        System.out.println("Car Features:");
        displayColor();
        displayTopSpeed();
        displayModel();
        displayUpgrades();
    }
    
    private void displayColor() {
        System.out.println("Color: " + color);
    }
    
    private void displayTopSpeed() {
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
    
    private void displayModel() {
        System.out.println("Model: " + model);
    }
    
    private void displayUpgrades() {
        System.out.println("Upgrades: " + upgrades);
    }
}