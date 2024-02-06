package day11_practice_tasks.RestaurantTask;

import day11_practice_tasks.RestaurantTask.Chef;
import day11_practice_tasks.RestaurantTask.Server;

import java.util.ArrayList;

public class Restaurant {
    String owner;
    String location;
    int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs =   new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        this.servers.add(server);

    }

    public void hireChef(Chef chef){
 this.chefs.add(chef);
    }


    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID == employeeID);
    }
    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }


}
