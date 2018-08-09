package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void expectOneMeterToBeEqualToOneMeter() {
        Length oneMeter = new Length(1, Unit.METER);
        assertEquals(new Length(1,Unit.METER), oneMeter);
    }

    @Test
    void expectOneCentimeterToBeEqualToOneCentimeter() {
        Length oneCentimeter = new Length(1, Unit.CENTIMETER);
        assertEquals(new Length(1, Unit.CENTIMETER), oneCentimeter);
    }

    @Test
    void expectOneInchToBeEqualToOneInch() {
        Length oneInch = new Length(1,Unit.INCH);
        assertEquals(new Length(1,Unit.INCH), oneInch);
    }

    @Test
    void expectOneMeterToBeEqualToOneHundredCentimeter() {
        Length oneMeter = new Length(1, Unit.METER);
        Length oneHundredCentimeter = new Length(100, Unit.CENTIMETER);
        assertEquals(oneMeter, oneHundredCentimeter);
    }

    @Test
    void expectOneInchToBeEqualToTwoPointFiveFourCentimeter() {
        Length oneInch = new Length(1, Unit.INCH);
        Length convertedInch = new Length(2.54, Unit.CENTIMETER);
        assertEquals(oneInch, convertedInch);
    }

}