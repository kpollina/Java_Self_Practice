package day13_practice_tasks.employee_task;

public class Developer extends Employee{

    private  String programmingLanguage;


    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if(programmingLanguage != null && !programmingLanguage.trim().isEmpty()){
            this.programmingLanguage = programmingLanguage;
        }else {
            System.err.println("The programming language must not be null, empty, or blank.");
            System.exit(1);
        }
    }

    @Override
    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + getProgrammingLanguage() + ".");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }
}
