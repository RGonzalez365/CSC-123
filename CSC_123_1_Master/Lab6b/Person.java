// Title: Lab 6b
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 02/17/2023

public class Person {
    private String name;
    private int age;
    private Car car;
    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public void driveCar() {
        System.out.println(name + " is driving the car.");
    }
    public void stopCar() {
        System.out.println(name + " has stopped the car.");
    }
    public void sellCar() {
        System.out.println(name + " has sold the car.");
        car = null;
    }
}
 class Car {
    private Engine engine;
    private NavigationSystem navigationSystem;
    private String make;
    public Car(Engine engine, NavigationSystem navigationSystem, String make) {
        this.engine = engine;
        this.navigationSystem = navigationSystem;
        this.make = make;
    }
    public Engine getEngine() {
        return engine;
    }
    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }
    public String getMake() {
        return make;
    }
    public void startEngine() {
        System.out.println("Engine is starting...");
        engine.turnOn();
    }
    public void stopEngine() {
        System.out.println("Engine is stopping...");
        engine.turnOff();
    }
    public void navigate() {
        System.out.println("Navigating...");
        navigationSystem.navigate();
    }
}
 class Engine {
    private boolean isOn;
    public Engine() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
        System.out.println("Engine is on.");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Engine is off.");
    }
}
 class NavigationSystem {
    private boolean isOn;
    public NavigationSystem() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
        System.out.println("Navigation system is on.");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Navigation system is off.");
    }
    public void navigate() {
        System.out.println("Navigation system is navigating...");
    }
}