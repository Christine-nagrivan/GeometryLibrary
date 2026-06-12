package ksafyanik;

public class Cube extends MyShape{

    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        return Math.pow(6 * this.side, 2);
    }

    @Override
    public double perimeter() {
        return this.side * 12;
    }

    public double volume() {
        return Math.pow(this.side, 3);
    }
}
