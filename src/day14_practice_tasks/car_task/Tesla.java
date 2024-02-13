package day14_practice_tasks.car_task;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla is parking automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving");
    }

    @Override
    public void start() {
        System.out.println("Tesla is started");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is being driven");
    }
}
/*
Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */