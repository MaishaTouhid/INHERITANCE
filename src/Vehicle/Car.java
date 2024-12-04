package Vehicle;

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    public void playMusic() {
        System.out.println("Playing music in the car");
    }
}

