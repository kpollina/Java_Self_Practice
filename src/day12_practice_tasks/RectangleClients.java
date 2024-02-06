package day12_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4,5);


        rectangle1.getWidth();

        System.out.println(rectangle1);

        System.out.println("-------------------------------");

        System.out.println("Area = " + rectangle1.calcArea());

        System.out.println("Perimeter = " + rectangle1.calcPerimeter());

        Rectangle rectangle2 = new Rectangle(1,-2);
        System.out.println(rectangle2);





    }
}
