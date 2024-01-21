package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {


        Employee employee = new Employee();

        employee.name = "Polina";
        employee.age =28;
        employee.gender = 'f';
        employee.jobTitle = "SDET";
        employee.salary = 150_000;


        employee.work();
        System.out.println(employee);

    }
}
