package day02_practice_tasks;

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

/*
Create a class named EmployeeInfo and write a program with the following requirements:

	Declare the following variables:
			employeeName (String)
			age (int)
			gender (char)
			companyName (String)
			jobTitle (String)
			yearsOfExperience (double)
			salary (int)
			isFullTime (boolean)
			isMarried (boolean)
			employeeId (String)

	Display the full employee information in the following format.

			Example:
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

			Output:
				Employee name: Shay
				Gender: F
				Age: 24
				Employee ID: B101
				Job title: SDET
				Company name: Apple Inc
				Full time: true
				Years of work experience: 2.5 years
				Salary: $120000.0
				Married: false


 */
