package day11_practice_tasks;

public class PizzaClients {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 2, 1);

        System.out.println(pizza1);
        System.out.println(pizza1.calCost());

        Pizza pizza2 = new Pizza ("medium", 4, 5);

        System.out.println(pizza2);
        System.out.println(pizza2.calCost());

        Pizza pizza3 = new Pizza ("large", 4, 0);

        System.out.println(pizza3);
        System.out.println(pizza3.calCost());

    }
}
