package m10_variables_data_types;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName;
        String buildingNumber;
        String streetName;
        String city;
        String state;
        String zipCode;

        fullName = "Aaron Kissinger";
        buildingNumber = "13621";
        streetName = "Legacy Circle";
        city = "Fairfax";
        state = "VA";
        zipCode = "22030";

        System.out.println("Your shipping address is:" + "\n\t\t\t\t" + fullName
        + "\n\t\t\t\t" + buildingNumber + " " + streetName + "\n\t\t\t\t" + city + "," +
               " " + state + " " + zipCode);
    }
}
