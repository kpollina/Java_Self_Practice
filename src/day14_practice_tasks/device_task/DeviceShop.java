package day14_practice_tasks.device_task;

public class DeviceShop {
    public static void main(String[] args) {

        // Instantiate an object from each concrete class:
        Iphone iphone = new Iphone("Iphone","15 Pro", 1200, "Silver", "256GB",true, true);
        Samsung samsung = new Samsung("Samsung","Galaxy S21", 1000, "Black", "256GB",true, true);
        Google google = new Google("Google","Pixel 6", 900, "White", "32GB", true, true);
        Desktop desktop = new Desktop("Dell","Inspiron",  800, "Black", "512GB",true,true);
        Laptop laptop = new Laptop("HP","Spectre", 1200, "Silver", "1TB",true,true);

        // Test all functions of each object:
        iphone.turnOn();
        iphone.call(26754366);
        iphone.text(91545690);
        iphone.downloadApp();
        iphone.turnOff();
        System.out.println(iphone);

        samsung.turnOn();
        samsung.call(98763210);
        samsung.text(77766527);
        samsung.downloadApp();
        samsung.turnOff();
        System.out.println(samsung);

        google.turnOn();
        google.call(51579087);
        google.text(26549900);
        google.downloadApp();
        google.turnOff();
        System.out.println(google);

        desktop.turnOn();
        desktop.turnOff();
        System.out.println(desktop);

        laptop.turnOn();
        laptop.turnOff();
        System.out.println(laptop);

    }
}
/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.


 */