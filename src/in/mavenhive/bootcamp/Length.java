package in.mavenhive.bootcamp;

import java.util.Objects;

// Represents a quantity with dimension distance.
class Length {
    private double magnitude;
    private Unit unit;

    Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(that.unit.inCentimeters(that.magnitude), unit.inCentimeters(magnitude)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }

    @Override
    public String toString() {
        return "Length{" +
                "magnitude=" + magnitude +
                ", unit=" + unit +
                '}';
    }
}
