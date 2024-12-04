package Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
// Main class to demonstrate the functionality
        Vehicle genericVehicle = new Vehicle("GenericBrand", 2020);
        genericVehicle.start();
        genericVehicle.stop();
        genericVehicle.displayInfo();
        genericVehicle.displayInfo("Vehicle Info:");

        Car myCar = new Car("Toyota", 2022, 4);
        myCar.start(); // This will call the overridden method in Car
        myCar.stop();
        myCar.displayInfo();
        myCar.playMusic();

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2021, true);
        myMotorcycle.start(); // This will call the overridden method in Motorcycle
        myMotorcycle.stop();
        myMotorcycle.displayInfo();
        myMotorcycle.popWheelie();
    }
}
