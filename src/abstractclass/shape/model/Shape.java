package abstractclass.shape.model;

public abstract class Shape {
    // method SIGNATURE to calculate area
    public  abstract float calculateArea();

    // method SIGNATURE to calculate perimeter
    public abstract float calculatePerimeter();


    // method definitions of classes that extend the Shape class
    public void diaplayPerimeter(String type, float value) {
        System.out.println(type + " Perimeter: " + value);
    }

    public void diaplayArea(String type, float value) {
        System.out.println(type + " Area: " + value);
    }
}
