package Vehicle;

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    public void popWheelie() {
        System.out.println("Popping a wheelie");
    }
}

