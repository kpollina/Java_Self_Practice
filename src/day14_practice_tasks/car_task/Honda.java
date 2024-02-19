package day14_practice_tasks.car_task;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
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
Create a Subclass of Car Named 'Honda'.
 */