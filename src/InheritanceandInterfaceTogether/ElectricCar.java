package InheritanceandInterfaceTogether;


// Derived class that inherits from Car and implements Vehicle interface
class ElectricCar extends Car implements Vehicle {
    private int batteryLevel;

    // Constructor
    public ElectricCar(String make, String model, int batteryLevel) {
        super(make, model);
        this.batteryLevel = batteryLevel;
    }

    // Overriding methods from the Vehicle interface
    @Override
    public void start() {
        System.out.println("Electric Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car is stopping.");
    }

    @Override
    public String getFuelType() {
        return "Electric";
    }

    // Method to display battery level
    public void displayBatteryLevel() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
