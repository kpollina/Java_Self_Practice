package day11_practice_tasks.RestaurantTask;

public class Server {
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is making an order");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
