package abstractclass.shape;

import abstractclass.shape.model.Circle;
import abstractclass.shape.model.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);;
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Triangle triangle = new Triangle(6,8,6,10);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
    }
}
