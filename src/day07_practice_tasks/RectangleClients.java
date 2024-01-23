package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5.5;
        rectangle.length = 10.5;

        rectangle.calculateArea();
        System.out.println(rectangle);

        rectangle.calculatePerimeter();
        System.out.println(rectangle);



        Rectangle rectangle2 = new Rectangle();

        rectangle2.width = 15.5;
        rectangle2.length = 7.5;

        rectangle2.calculateArea();
        System.out.println(rectangle2);

        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);

    }
}
/*
Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */