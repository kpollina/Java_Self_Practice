package day13_practice_tasks.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Michael Poul",36,"male","ID 675894","SDET",110_000,
                "Amazon");
        System.out.println(tester);
        tester.work();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        Developer developer = new Developer("Nick  Nickov",30,"male","ID 0987",
                "Developer",150_000, "Cowbell","Java");
        System.out.println(developer);
        developer.work();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        Teacher teacher = new Teacher("Anna Zyb",26,"female","ID 35457","Teacher",
                60_000,"UPenn");
        System.out.println(teacher);
        teacher.work();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        Driver driver = new Driver("Eddie Brown", 18,"male","ID 34567","Truck Driver",
                80_000,"Mashina LLC");
        System.out.println(driver);
        driver.work();


    }
}
