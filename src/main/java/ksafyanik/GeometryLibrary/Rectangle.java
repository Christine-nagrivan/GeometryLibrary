package ksafyanik.GeometryLibrary;

public class Rectangle {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double square() {
        return this.a * this.b;
    }

    public double perimeter() {
        return 2 * (this.a + this.b);
    }
}
