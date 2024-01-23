package day07_practice_tasks;

public class AddressHome {
    public static void main(String[] args) {

        Address home = new Address();

        home.buildingNumber = 536;
        home.street = "Evergreen Ct";
        home.city = "Bensalem";
        home.state = "PA";
        home.zipcode = 19020;


        String result =  home.getAddress();
        System.out.println(result);


    }
}
