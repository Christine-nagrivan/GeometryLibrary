package ksafyanik.GeometryLibrary;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double square() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
