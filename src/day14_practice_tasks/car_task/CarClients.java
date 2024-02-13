package day14_practice_tasks.car_task;

public class CarClients {

    public static void main(String[] args) {

        // Instantiate objects from each concrete class:

        Toyota toyota = new Toyota("Toyota","Camry",2015,15_000,"Grey");
        Honda honda = new Honda("Honda","Accord", 2023, 28_000, "Red");
        BMW bmw = new BMW("BMW", "X5",2021, 60000, "Black");
        Audi audi = new Audi("Audi", "A4", 35000, 35_000,"White");
        Mercedes mercedes = new Mercedes("Mercedes", "E-Class",2021, 55_000, "Silver");
        Tesla tesla = new Tesla("Tesla","Model S", 2022, 80_000, "Gray");
        Nio nio = new Nio("Nio","ES6", 2023, 75_000, "Green");
        CydeoCar cydeoCar = new CydeoCar("CydeoCar","FutureCar", 2025, 100_000, "Purple");

        // Test all functions of each object:
        toyota.start();
        toyota.drive();
        toyota.stop();
        System.out.println(toyota);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        honda.start();
        honda.drive();
        honda.stop();
        System.out.println(honda);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        bmw.start();
        bmw.drive();
        bmw.stop();
        System.out.println(bmw);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        audi.start();
        audi.drive();
        audi.stop();
        audi.autoPark();
        System.out.println(audi);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        mercedes.start();
        mercedes.drive();
        mercedes.stop();
        mercedes.autoPark();
        System.out.println(mercedes);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        tesla.start();
        tesla.drive();
        tesla.stop();
        tesla.autoPark();
        tesla.selfDrive();
        System.out.println(tesla);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        nio.start();
        nio.drive();
        nio.stop();
        nio.autoPark();
        nio.selfDrive();
        System.out.println(nio);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.stop();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();
        System.out.println(cydeoCar);



    }

}
/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */