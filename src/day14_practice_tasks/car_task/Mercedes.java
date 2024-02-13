package day14_practice_tasks.car_task;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes is parking automatically");
    }

    @Override
    public void start() {
        System.out.println("Mercedes is started");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes is being driven");
    }
}
/*
Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
 */