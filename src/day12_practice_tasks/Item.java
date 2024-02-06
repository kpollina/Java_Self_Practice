package day12_practice_tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }


    public void setName(String name) {

        if(name.isEmpty() || name.isBlank() || !Character.isLetter(name.charAt(0)) || !name.matches("^[a-zA-Z ]*$")){

            System.err.println("Name cannot be empty or blank,cannot contain any special characters other than space. Name must start with letters: " + name);
            System.exit(1);
        }

        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {

        if( unitPrice < 0){
            System.err.println("Price cannot be negative: " + unitPrice);
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {

        if( quantity < 0){
            System.err.println("Quantity cannot be negative: " + quantity);
            System.exit(1);
        }

        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }


    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item: " +
                "name = " + name  +
                ", unitPrice = $" + unitPrice +
                ", quantity = " + quantity +
                ", total cost = $" + calcCost()+
                '.';
    }
}
/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */