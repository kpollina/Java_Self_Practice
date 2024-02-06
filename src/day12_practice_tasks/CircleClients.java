package day12_practice_tasks;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        circle1.setRadius(5.5);

        System.out.println(circle1);

        System.out.println("-------------------------------");

        System.out.println("Radius = " + circle1.getRadius());
        System.out.println("Area = " + circle1.calcArea());
        System.out.println("Perimeter = " + circle1.calcPerimeter());

        Circle circle2 = new Circle();
        circle2.setRadius(-2);
        System.out.println(circle2);
    }

}
