package ksafyanik;

public interface GeometryComparator {

    static <T extends MyShape> int compareBySquare(T first, T second) {
        return Double.compare(first.square(), second.square());
    }

    static <T extends MyShape> boolean hasEqualSquare(T first, T second) {
        return Double.compare(first.square(), second.square()) == 0;
    }

    static <T extends MyShape> MyShape maxBySquare(T first, T second) {
        return compareBySquare(first, second) >= 0
                ? first
                : second;
    }

    static <T extends MyShape> MyShape minBySquare(T first, T second) {
        return compareBySquare(first, second) <= 0
                ? first
                : second;
    }
}
