package day14_practice_tasks.car_task;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota is started");
    }

    @Override
    public void drive() {
        System.out.println("Toyota is being driven");
    }
}
/*
Create a Subclass of Car Named 'Toyota'.
 */