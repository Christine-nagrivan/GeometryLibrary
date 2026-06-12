package ksafyanik;

public class Rectangle extends MyShape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double square() {
        return this.a * this.b;
    }

    @Override
    public double perimeter() {
        return 2 * (this.a + this.b);
    }
}
