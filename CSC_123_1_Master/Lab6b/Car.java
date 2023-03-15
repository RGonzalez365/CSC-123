// Title: Lab 6b
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 02/17/2023

public abstract class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public abstract void drive();
    public abstract void stop();
    public abstract void honk();
}
class TeslaModel3 extends Car {
    private int batteryCapacity;
    private int maxRange;
    private boolean autopilotEnabled;
    public TeslaModel3(String make, String model, int year, int batteryCapacity, int maxRange, boolean autopilotEnabled) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.autopilotEnabled = autopilotEnabled;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public int getMaxRange() {
        return maxRange;
    }
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
    @Override
    public void drive() {
        System.out.println("Driving the Tesla Model 3...");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the Tesla Model 3...");
    }
    @Override
    public void honk() {
        System.out.println("Beep beep! Honking the Tesla Model 3...");
    }
}
class FordF350 extends Car {
    private int engineSize;
    private int towingCapacity;
    private boolean fourWheelDrive;
    public FordF350(String make, String model, int year, int engineSize, int towingCapacity, boolean fourWheelDrive) {
        super(make, model, year);
        this.engineSize = engineSize;
        this.towingCapacity = towingCapacity;
        this.fourWheelDrive = fourWheelDrive;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public int getTowingCapacity() {
        return towingCapacity;
    }
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
    @Override
    public void drive() {
        System.out.println("Driving the Ford F350...");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the Ford F350...");
    }
    @Override
    public void honk() {
        System.out.println("Honking the Ford F350...");
    }
}
 class CarOwner {
    private String name;
    private Car car;
    public CarOwner(String name, Car car) {
        this.name = name;
        this.car = car;
    }
    public String getName() {
        return name;
    }
    public Car getCar() {
        return car;
    }
    public void startCar() {
        System.out.println(name + " is starting the car...");
        car.drive();
    }
    public void stopCar() {
        System.out.println(name + " is stopping the car...");
        car.stop();
    }
    public void honkCar() {
        System.out.println(name + " is honking the car...");
        car.honk();
    }
}
