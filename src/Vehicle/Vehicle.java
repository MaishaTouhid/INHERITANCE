package Vehicle;    //exam

// Base class
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    // Method Overloading
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public void displayInfo(String message) {
        System.out.println(message);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}






