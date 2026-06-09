package ksafyanik.GeometryLibrary;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        double halfPerimeter = this.perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter * this.b) * (halfPerimeter * this.c));
    }
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
