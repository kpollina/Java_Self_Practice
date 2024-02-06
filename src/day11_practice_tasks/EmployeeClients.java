package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1= new Employee("Polina Vergasova",28,'f',"SDET",150_000);
        System.out.println(employee1);

        employee1.work();

        Employee employee2 = new Employee("Maxim Ch","driver",200_000);
        employee2.work();



    }
}
