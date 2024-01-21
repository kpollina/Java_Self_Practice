package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {

        Address address = new Address();

        address.buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.state = "VA";
        address.zipcode = "22012";


       String result =  address.getAddress();
        System.out.println(result);




    }
}
