package day11_practice_tasks.RestaurantTask;

import day11_practice_tasks.RestaurantTask.Chef;
import day11_practice_tasks.RestaurantTask.Restaurant;
import day11_practice_tasks.RestaurantTask.Server;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant samarkand = new Restaurant("Shail", "Feasterville", 2);

        Server server1 = new Server("Mac Ch", 39876, 20, true);
        Server server2 = new Server("Caul Ch", 3456, 20, true);
        Server server3 = new Server("Pac Ch", 3096, 20, true);
        Server server4 = new Server("Nac Ch", 47456, 20, true);
        Server server5 = new Server("Zac Ch", 987456, 20, true);

        Chef chef1 = new Chef("Murat", 959757, 40, true);
        Chef chef2 = new Chef("Tarat", 195857, 40, true);
        Chef chef3 = new Chef("Nurat", 295857, 40, true);


        samarkand.hireChef(chef3);
        samarkand.hireChef(chef1);
        samarkand.hireChef(chef2);

        samarkand.hireServer(server3);
        samarkand.hireServer(server4);

        System.out.println(samarkand);


    }
}
