package day14_practice_tasks.device_task;

public abstract class Phone extends Device {


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    // Non-abstract methods:
    public void call(long phoneNum) {
        System.out.println("Calling " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println("Texting " + phoneNum);
    }

    @Override
    public String toString() {
        return "Phone{} " + super.toString();
    }
}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */