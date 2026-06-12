package ksafyanik;

public class Circle extends MyShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
