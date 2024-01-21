package day07_practice_tasks;

public class ItemClients {


    public static void main(String[] args) {

        Item item = new Item();

        item.itemName = "Orange";
        item.unitPrice = 2;
        item.quantity = 10;


        item.calCost();
        System.out.println(item);


    }
}
/*
Create a custom class named Item with the following attributes and actions:

      Attributes:
            itemName (String): used for storing the name of the item.
            unitPrice (double): used for storing the unit price of the item.
            quantity (int): used for storing the quantity of the item.

      Actions:
            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.


      Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */