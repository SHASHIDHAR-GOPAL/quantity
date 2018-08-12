package in.mavenhive.bootcamp;

// Represents a definite magnitude of a quantity.
enum Unit {
    CENTIMETER(1.0),
    METER(100.0),
    INCH(2.54),
    GRAM(1.0),
    KILOGRAM(1000.0),
    POUND(453.5);

    double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double convert(double magnitude, Unit finalUnit) {
        return magnitude * conversionFactor / finalUnit.conversionFactor;
    }
}
