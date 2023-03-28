package Shapes;

public class Circle extends Shape{

    private Double radius;

    public final Double getRadius() {
        return radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    Double calculateArea() {
        return radius * Math.PI;
    }

    public final Double getPerimeter() {
        return calculatePerimeter();
    }

    public final Double getArea() {
        return calculateArea();
    }
}
