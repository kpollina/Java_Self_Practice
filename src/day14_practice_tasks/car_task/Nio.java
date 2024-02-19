package day14_practice_tasks.car_task;

public class Nio extends Car implements AutoPark, AutoPilot{
    public Nio(String make, String model, int year, double price, String color) {
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
}
/*
Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */