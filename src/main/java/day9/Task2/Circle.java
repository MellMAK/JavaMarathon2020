package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI* radius;
    }

}
