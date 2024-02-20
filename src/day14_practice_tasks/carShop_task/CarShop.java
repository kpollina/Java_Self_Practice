package day14_practice_tasks.carShop_task;

import day14_practice_tasks.car_task.Audi;
import day14_practice_tasks.car_task.Car;
import day14_practice_tasks.car_task.Honda;
import day14_practice_tasks.car_task.Tesla;

import java.util.ArrayList;

public class CarShop {

    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Honda","Pilot",2010, 25_000, "White"),
                new Audi("Audi","Q6", 2014,31_000, "Red"),
                new Honda("Honda","Accord", 2011,20_000, "White"),
                new Audi("Audi","Q4",2015 , 33_000,"Blue"),
                new Audi("Audi","A7", 2019,35_000, "Black"),
                new Audi("Audi","Q8", 2018,40_000, "White"),
                new Audi("Audi","Q5", 2008,30_000, "Purple"),
                new Audi("Audi","A4",2015 , 30_000, "Black"),
                new Honda("Honda","Civic", 2018,30_000,  "Red"),
                new Honda("Honda","CR-V", 2012, 23_000,  "Red"),
                new Honda("Honda","HR-V", 2019,35_000, "Blue"),
                new Tesla("Tesla", "Model 3", 2015, 45_000, "White"),
                new Tesla("Tesla","Model Y", 2017, 65_000, "Black"),
                new Tesla("Tesla","Model X", 2016, 48_000,"White" ),
                new Tesla("Tesla","Model X", 2014,48_000, "Blue"),
        };

        // Task 1.2: Display all cars eligible for recall:

        System.out.println("Cars eligible for recall:");
        displayRecallCars(cars);

        // Task 1.3: Display the car with the highest price

        System.out.println("Car with the highest price:");
        highestPriceCar(cars);

        // Task 1.4: Display the car with the lowest price
        System.out.println("Car with the lowest price:");
        lowestPriceCar(cars);

        // Task 1.5: Create an ArrayList of Tesla named 'teslaCars'
        ArrayList<Tesla> teslaCars = displayTeslaCars(cars);
        System.out.println("Tesla cars:");
        for (Tesla tesla : teslaCars) {
            System.out.println(tesla);
        }


    }

    // Helper method to display cars eligible for recall:
    private static void displayRecallCars(Car[] cars){
        for (Car car : cars) {
            if((car instanceof Honda && car.getYear() >= 2010 && car.getYear()<= 2011)||
            (car instanceof Audi && car.getYear()>=2010 && car.getYear()<=2019)||
                    (car instanceof Tesla && car.getYear()>= 2015 && car.getYear()<=2016))
                System.out.println(car.getMake() + " " + car.getModel() + ": Year" + car.getYear());
        }
    }
    // Helper method to display the car with the highest price
    private static void highestPriceCar(Car[] cars){
        Car highestPrice = cars[0];

        for (Car car : cars) {
            if(car.getPrice() > highestPrice.getPrice()){
                highestPrice = car;
            }
        }
        System.out.println(highestPrice);
    }
    // Helper method to display the car with the lowest price
    private static void lowestPriceCar(Car[] cars){
        Car lowestPrice = cars[0];
        for (Car car : cars) {
            if(car.getPrice() < lowestPrice.getPrice()){
                lowestPrice = car;
            }
        }
        System.out.println(lowestPrice);
    }

    // Helper method to create an ArrayList of Tesla cars
    private static ArrayList<Tesla> displayTeslaCars (Car[] cars){
        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof Tesla){
                teslaCars.add((Tesla)car) ;
            }
        }
        return teslaCars;
    }

}
/*
CarShop Class Task:
1. Create a Class Named 'CarShop':
    - Given an array of Car objects:
            Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
            };

    - Tasks:
        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.

 */