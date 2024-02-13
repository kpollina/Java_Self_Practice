package day14_practice_tasks.device_task;

public class Iphone extends Phone implements Downloadable, AppleApps{
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("iPhone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("iPhone is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading an app from the App Store");
    }
}
/*
7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

 */