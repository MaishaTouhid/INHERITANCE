package InheritanceandInterfaceTogether;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 85);

        // Display car information
        tesla.displayCarInfo();

        // Display fuel type and battery level
        System.out.println("Fuel Type: " + tesla.getFuelType());
        tesla.displayBatteryLevel();

        // Start and stop the car
        tesla.start();
        tesla.stop();
    }
}
