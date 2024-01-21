package day03_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        int week = 52;
        double grossPay = hourlyRate * weeklyHours * week;
        double federalTax = (grossPay * federalTaxRate) / 100;
        double stateTax = (grossPay * stateTaxRate) /100;
        double totalTax = federalTax + stateTax;
        double salaryAfter = grossPay - totalTax;




        System.out.println("Gross pay is: $"+ grossPay);
        System.out.println("Federal tax is: $"+ federalTax);
        System.out.println( "State tax is: $"+ stateTax);
        System.out.println("Total tax is: $"+ totalTax);
        System.out.println("Net income is: $"+ salaryAfter);


    }
}
