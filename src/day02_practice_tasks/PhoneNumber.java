package day02_practice_tasks;

public class PhoneNumber {

    public static void main(String[] args) {

        String countryCode;
        String areaCode;
        String localNumber;

        countryCode = "1";
        areaCode = "703";
        localNumber = "4512625";

        System.out.println("Phone Number is: +"
                + countryCode + "(" + areaCode + ")" + "-" + localNumber);




    }
}

/*
Create a class named PhoneNumber and declare the following variables:
		countryCode
		areaCode
		localNumber

	Use string concatenation to display the phone number.

		Example:
			countryCode = 1;
		      areaCode = 703;
		      localNumber = 4512625;

		Output:
			Phone number is: +1(703)-4512625

 */