package day14_practice_tasks.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() +" is parking automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() +" is self-driving");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() +" is started");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() +" is being driven");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() +" is flying");
    }
}
/*
Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
 */