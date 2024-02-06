package day11_practice_tasks;

public class Pizza {
    String size;
    int numberOfCheeseTopping;
    int numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }



    public double calCost(){

        switch (size){
            case "small" -> {
                return 10 + (numberOfCheeseTopping+numberOfPepperoniTopping)*2;
            }

            case "medium" -> {
            return 12 +  (numberOfCheeseTopping+numberOfPepperoniTopping)*2;
            }
            case  "large" ->{
                return 14 + (numberOfCheeseTopping+numberOfPepperoniTopping)*2;
            }
        }

        return 0;
   }


    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost is=$"+calCost() +
                '}';
    }
}
/*

1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size,
		quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects,
    and test each function of the pizza object.
 */