// Title: Lab 6b
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 02/17/2023

public class Computer {
    private HardDrive hardDrive;
    private Processor processor;
    public Computer(HardDrive hardDrive, Processor processor) {
        this.hardDrive = hardDrive;
        this.processor = processor;
    }
    public HardDrive getHardDrive() {
        return hardDrive;
    }
    public Processor getProcessor() {
        return processor;
    }    
    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }    
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public void start() {
        System.out.println("Computer is starting...");
    }    
    public void shutdown() {
        System.out.println("Computer is shutting down...");
    }  
    public void print(String document) {
        Printer.print(document);
    }
}
 class HardDrive {
    private int capacity;
    private String type;
    private String brand; 
    public HardDrive(int capacity, String type, String brand) {
        this.capacity = capacity;
        this.type = type;
        this.brand = brand;
    }
    public int getCapacity() {
        return capacity;
    }  
    public String getType() {
        return type;
    }   
    public String getBrand() {
        return brand;
    }  
    public void read() {
        System.out.println("Hard drive is reading data...");
    }   
    public void write() {
        System.out.println("Hard drive is writing data...");
    }
    public void format() {
        System.out.println("Hard drive is being formatted...");
    }
}
 class Processor {
    private int speed;
    private String model;
    private int numCores;  
    public Processor(int speed, String model, int numCores) {
        this.speed = speed;
        this.model = model;
        this.numCores = numCores;
    }  
    public int getSpeed() {
        return speed;
    }    
    public String getModel() {
        return model;
    }  
    public int getNumCores() {
        return numCores;
    }   
    public void process() {
        System.out.println("Processor is processing data...");
    }   
    public void calculate() {
        System.out.println("Processor is performing calculations...");
    } 
    public void sleep() {
        System.out.println("Processor is going to sleep mode...");
    }
}
 class Printer {
    private static boolean usbConnected;  
    public static boolean isUsbConnected() {
        return usbConnected;
    }   
    public static void connect() {
        usbConnected = true;
        System.out.println("Printer is connected to the computer via USB cable.");
    }   
    public static void disconnect() {
        usbConnected = false;
        System.out.println("Printer is disconnected from the computer.");
    }
    public static void print(String document) {
        if (usbConnected) {
        System.out.println("Printing " + document + "...");
        } 
        else {
        	System.out.println("Printer is not connected.");
        	}
        }
    }