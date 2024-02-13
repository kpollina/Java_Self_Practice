package day14_practice_tasks.device_task;

public class Samsung extends Phone implements Downloadable, AndroidApps{
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung phone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung phone is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading an app from Google Play");
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