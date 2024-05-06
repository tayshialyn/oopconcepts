package abstractclass.shape.model;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) Math.PI * radius * radius;  // set it to return a float
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
