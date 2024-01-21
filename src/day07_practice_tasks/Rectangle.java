package day07_practice_tasks;

public class Rectangle {

    public double width;
    public double length;

    public double calculateArea(){
        System.out.println(width*length);
        return width*length;
    }

    public double calculatePerimeter(){
        System.out.println((width*length) * 2);
        return (width*length) * 2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
