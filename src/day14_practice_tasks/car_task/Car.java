package day14_practice_tasks.car_task;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;


    // Constructor
    public Car(String make, String model, int year, double price, String color) {
        if(make == null && make.isEmpty() && model == null && model.isEmpty() && year <= 1886){
throw new RuntimeException("make, model, color must not be null or empty and year must not be less than 1886.");
        }else {
            this.make = make;
            this.model = model;
            this.year = year;
            setPrice(price);
            setColor(color);
        }
    }

    // Encapsulation
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new RuntimeException("price must not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            throw new RuntimeException("color must not be null or empty");
        }
        this.color = color;
    }

    // Abstract methods
    public abstract void start();
    public abstract void drive();

    // Non-abstract methods
    public void stop(){
        System.out.println("Car is stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Car Task Requirements:
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()

2. Create an Interface Named 'AutoPark':
    - Variable:
        - hasAutoPark
    - Abstract Method:
        - autoPark()

3. Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()

4. Create an Interface Named 'Flyable':
    - Variable:
        - canFly
    - Abstract Method:
        - fly()

5. Create a Subclass of Car Named 'Toyota'.
6. Create a Subclass of Car Named 'Honda'.
7. Create a Subclass of Car Named 'BMW'.
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */
