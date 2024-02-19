package day14_practice_tasks.device_task;

public abstract class Device {
    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery = true;
    private boolean hasPowerButton = true;

    //Constructor: Initializes all fields.
    protected Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if(brand == null && brand.isEmpty() &&
                model == null && model.isEmpty() && size == null && size.isEmpty()){
            throw new RuntimeException("brand, model,size must not be null or empty.");
        }else {
            this.brand = brand;
            this.model = model;
            setPrice(price);
            setColor(color);
            this.size = size;
            this.hasBattery = hasBattery;
            this.hasPowerButton = hasPowerButton;
        }

    }
    //Encapsulate all fields.


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new RuntimeException("price must be positive");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color != null && !color.isEmpty()){
            this.color = color;
        } else{
            throw new RuntimeException("color must not be null or empty.");
        }

    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    // Abstract methods:
    public abstract void turnOn();

    public abstract void turnOff();

    // Non-abstract method:


    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
Device Task Requirements:

1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()

3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.

4. Create an Interface Named 'Downloadable':
    - Abstract Method:
        - downloadApp()

5. Create a Child Interface of Downloadable Named 'AndroidApps':
    - Variables:
        - AppStoreName
        - OS

6. Create a Child Interface of Downloadable Named 'AppleApps':
    - Variables:
        - AppStoreName
        - OS

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

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop

9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */