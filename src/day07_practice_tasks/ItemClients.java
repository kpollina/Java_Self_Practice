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
