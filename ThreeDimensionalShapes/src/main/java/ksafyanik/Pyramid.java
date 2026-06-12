package ksafyanik;

public class Pyramid extends MyShape{

    private final double baseSide;
    private final double apothem;
    private final double height;

    public Pyramid(double baseSide, double apothem) {
        this.baseSide = baseSide;
        this.apothem = apothem;
        this.height = Math.sqrt(apothem * apothem - (baseSide * baseSide) / 4);
    }

    @Override
    public double square() {
        double baseSquare = this.baseSide * this.baseSide;
        double lateralSquare = 4 * (this.baseSide * this.apothem / 2);
        return baseSquare + lateralSquare;
    }

    @Override
    public double perimeter() {
        double sideEdge = Math.sqrt(this.apothem * this.apothem + Math.pow(this.baseSide / 2, 2));
        return 4 * this.baseSide + 4 * sideEdge;
    }

    public double volume() {
        return this.baseSide * this.baseSide * this.height / 3;
    }
}
