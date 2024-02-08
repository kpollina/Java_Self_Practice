package day13_practice_tasks.phone_task;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone", "15 Pro", "256GB",1180,"white");
        System.out.println(iPhone);
        iPhone.call("267-887-65-45");
        iPhone.text("267-887-65-45");
        iPhone.faceTime("267-887-65-45");

        IPhone iPhone2 = new IPhone("iPhone", "15 Pro", "256GB",-1180,"white");
        System.out.println(iPhone2);

        System.out.println("-----------------------------------------------------------------------");

        Samsung samsung = new Samsung("Samsung","24 S ULTRA", "256GB", 1140,"black");
        System.out.println(samsung);
        samsung.call("567-983-15-45");
        samsung.text("567-983-15-45");


        System.out.println("-----------------------------------------------------------------------");

        Nokia nokia = new Nokia("Nokia", "3210", "16GB",100,"Gray");
        System.out.println(nokia);
        nokia.call("761-482-15-41");
        nokia.text("761-482-15-41");


    }
}

/*
Phone Task Requirements:
1. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.

2. Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.

3. Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.

4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */