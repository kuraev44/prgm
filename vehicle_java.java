class Vehicle {
    private String model;
    private int yearOfManufacture;
    protected int mileage;

    Vehicle() {
        model = "DefaultModel";
        mileage = 0;
        yearOfManufacture = 2000;
    }

    Vehicle(String m, int y, int mi) {
        model = m;
        mileage = mi;
        yearOfManufacture = y;
    }

    Vehicle(Vehicle ob) {
        model = ob.model;
        mileage = ob.mileage;
        yearOfManufacture = ob.yearOfManufacture;
    }

    String getModel() {
        return model;
    }

    boolean isOld(int currentYear) {
        return (currentYear - yearOfManufacture) > 10;
    }

    protected int compareAge(int currentYear) {
        return currentYear - yearOfManufacture;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car() {
        super();
        numDoors = 4;
    }

    Car(String m, int y, int mi, int doors) {
        super(m, y, mi);
        numDoors = doors;
    }

    Car(int y, int mi, int doors) {
        super("CarModel", y, mi);
        numDoors = doors;
    }

    Car(Car ob) {
        super(ob);
        numDoors = ob.numDoors;
    }

    boolean isOld(int currentYear) {
        return compareAge(currentYear) > 5;
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle() {
        super();
        hasSidecar = false;
    }

    Motorcycle(String m, int y, int mi, boolean sidecar) {
        super(m, y, mi);
        hasSidecar = sidecar;
    }

    Motorcycle(int y, int mi, boolean sidecar) {
        super("MotorcycleModel", y, mi);
        hasSidecar = sidecar;
    }

    Motorcycle(Motorcycle ob) {
        super(ob);
        hasSidecar = ob.hasSidecar;
    }

    boolean isOld(int currentYear) {
        return compareAge(currentYear) > 8;
    }
}

class VehicleTest {
    public static void main(String args[]) {
        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Vehicle("Toyota", 2010, 50000);
        vehicles[1] = new Car("Ford", 2008, 30000, 4);
        vehicles[2] = new Motorcycle("Harley", 2015, 15000, true);
        vehicles[3] = new Car(2013, 45000, 2);
        vehicles[4] = new Motorcycle(2010, 20000, false);

        int currentYear = 2023;

        if (args.length != 0) {
            currentYear = Integer.parseInt(args[0]);
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getModel() + " is old: " + vehicle.isOld(currentYear));
        }
    }
}