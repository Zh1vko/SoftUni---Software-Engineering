package Shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    Double calculateArea() {
        return height * width;
    }

    public final Double getPerimeter() {
        return calculatePerimeter();
    }

    public final Double getArea() {
        return calculateArea();
    }
}
