package day13_practice_tasks.employee_task;

public class Employee extends Person {

    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;


    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        if(employeeId != null && !employeeId.trim().isEmpty()){
            this.employeeId = employeeId;
        }else {
            System.err.println("The employee ID must not be null, empty, or blank.");
            System.exit(1);
        }
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        if(jobTitle != null && !jobTitle.trim().isEmpty()){
            this.jobTitle = jobTitle;
        }else {
            System.err.println("The job title must not be null, empty, or blank.");
            System.exit(1);
        }

    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary> 0){
            this.salary = salary;
        }else{
            System.err.println("The salary must be greater than zero.");
            System.exit(1);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(companyName != null && !companyName.trim().isEmpty()){
            this.companyName = jobTitle;
        }else {
            System.err.println("The company name must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                "} " + super.toString();
    }


}
