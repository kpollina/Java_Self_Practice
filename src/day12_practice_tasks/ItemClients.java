package day12_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item("ball",10, 3);

        System.out.println(item1);

        System.out.println("--------------------------------------");

        System.out.println("Total cost = $" + item1.calcCost());

        Item item2 = new Item("toy", 2, -1);
        System.out.println(item2);


    }
}
