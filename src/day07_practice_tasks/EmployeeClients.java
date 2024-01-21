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
/*
Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */