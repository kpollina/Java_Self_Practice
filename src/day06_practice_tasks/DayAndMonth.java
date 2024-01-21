package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {

        day(5);
        month(6);
        daysInMonth(6);

    }


    public static void day (int day){
        if(day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid number");
        }
    }

public static void month (int month){

        if(month == 1){
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        }else if (month == 10)
            System.out.println("October");
        else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        }else {
            System.out.println("Invalid number");
        }
}


    public static void daysInMonth (int month){

        if(month == 1){
            System.out.println("January has 31 days");
        } else if (month == 2) {
            System.out.println("February has 29 days");
        } else if (month == 3) {
            System.out.println("March has 31 days");
        } else if (month == 4) {
            System.out.println("April has 30 days");
        } else if (month == 5) {
            System.out.println("May has 31 days");
        } else if (month == 6) {
            System.out.println("June has 30 days");
        } else if (month == 7) {
            System.out.println("July has 31 days");
        } else if (month == 8) {
            System.out.println("August has 31 days");
        } else if (month == 9) {
            System.out.println("September has 30 days");
        }else if (month == 10)
            System.out.println("October has 31 days");
        else if (month == 11) {
            System.out.println("November has 30 days");
        } else if (month == 12) {
            System.out.println("December has 31 days");
        }else {
            System.out.println("Invalid number");
        }
    }


}
/*
Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

 */
