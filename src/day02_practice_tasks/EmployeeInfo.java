package m10_variables_data_types;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName;
        int age;
        char gender;
        String companyName;
        String jobTitle;
        double yearsOfExperience;
        int salary;
        boolean isFullTime;
        boolean isMarried;
        String employeeId;

        employeeName = "Shay";
        age = 24;
        gender = 'F';
        companyName = "Apple Inc";
        jobTitle = "SDET";
        yearsOfExperience = 2.5;
        salary = 120_000;
        isFullTime = true;
        isMarried = false;
        employeeId = "B101";

        System.out.println("Employee name: " + employeeName + "\nGender: " + gender + "\nAge: " + age + "\nEmployeeID: " + employeeId +
                "\nJob title: " + jobTitle + "\nCopmany name: " + companyName + "\nFull time: " + isFullTime +
                "\nYears of work experience: " + yearsOfExperience + "\nSalary: $" + salary + ".0" + "\nMarried: " + isMarried);
    }
}
