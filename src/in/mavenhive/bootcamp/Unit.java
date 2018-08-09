package in.mavenhive.bootcamp;

// Represents a definite magnitude of length.
enum Unit {
    CENTIMETER(1.0),
    METER(100.0),
    INCH(2.54);

    double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double inCentimeters(double magnitude) {
        return magnitude * conversionFactor;
    }
}
