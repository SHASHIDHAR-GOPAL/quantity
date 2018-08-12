package in.mavenhive.bootcamp;

import java.util.Objects;

// Represents a physical property that can be quantified by measurement.
class Quantity {
    private final double magnitude;
    private final Unit unit;
    private final UnitType unitType;

    private Quantity(double magnitude, Unit unit, UnitType unitType) {
        this.magnitude = magnitude;
        this.unit = unit;
        this.unitType = unitType;
    }

    static Quantity meter(double magnitude) {
        return new Quantity(magnitude, Unit.METER, UnitType.LENGTH);
    }

    static Quantity centimeter(double magnitude) {
        return new Quantity(magnitude, Unit.CENTIMETER, UnitType.LENGTH);
    }

    static Quantity inch(double magnitude) {
        return new Quantity(magnitude, Unit.INCH, UnitType.LENGTH);
    }

    static Quantity gram(double magnitude) {
        return new Quantity(magnitude, Unit.GRAM, UnitType.WEIGHT);
    }

    static Quantity kilogram(double magnitude) {
        return new Quantity(magnitude, Unit.KILOGRAM, UnitType.WEIGHT);
    }

    static Quantity pound(double magnitude) {
        return new Quantity(magnitude, Unit.POUND, UnitType.WEIGHT);
    }

    Quantity add(Quantity that) {
        if (unitType == that.unitType) return addIfCompatibleUnitTypes(that);
        return that;
    }

    private Quantity addIfCompatibleUnitTypes(Quantity that) {
        double totalMagnitude = unit.convert(magnitude, unit) + that.unit.convert(that.magnitude, unit);
        return new Quantity(totalMagnitude, unit, unitType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity that = (Quantity) o;
        return unitType == that.unitType &&
                Double.compare(that.unit.convert(that.magnitude, unit), unit.convert(magnitude, unit)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit, unitType);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "magnitude=" + magnitude +
                ", unit=" + unit +
                ", unitType=" + unitType +
                '}';
    }
}
