package InheritanceandInterfaceTogether;

public class Car {
    private String make;
    private String model;

    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }
}
