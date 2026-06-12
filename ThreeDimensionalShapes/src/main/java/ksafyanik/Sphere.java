package ksafyanik;

public class Sphere extends MyShape {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.pow(4 * Math.PI * this.radius, 2);
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public double volume() {
        return (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
    }
}
