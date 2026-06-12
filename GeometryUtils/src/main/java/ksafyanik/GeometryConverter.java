package ksafyanik;

public interface GeometryConverter {
    static double centimetersToMeters(double cm) {
        return cm / 100;
    }

    static double metersToCentimeters(double m) {
        return m * 100;
    }

    static double squareCentimetersToSquareMeters(double cm2) {
        return cm2 / 10_000;
    }

    static double squareMetersToSquareCentimeters(double m2) {
        return m2 * 10_000;
    }
}
