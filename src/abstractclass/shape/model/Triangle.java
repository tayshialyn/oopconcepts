package abstractclass.shape.model;

public class Triangle extends Shape {

    // variable x 3 sides
    private float sideA;
    private float base;
    private float sideC;
    private float height;


    // constructor to store the sides of the triangle

    public Triangle(float sideA, float base, float sideC, float height) {
        this.sideA = sideA;
        this.base = base;
        this.sideC = sideC;
        this.height = height;
    }

    // public method to calc. the area of the triangle
    @Override
    public float calculateArea() {
        return (float) (0.5 * base * height);
    }

    // public method to calc. the area of the triangle
    @Override
    public float calculatePerimeter() {
        return (float) (sideA + base + sideC);
    }
}
