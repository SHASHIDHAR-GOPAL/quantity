package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void expectConversionFromMeterToCentimeter() {
        assertEquals(100, Unit.METER.convert(1));
    }

    @Test
    void expectConversionFromInchToCentimeter() {
        assertEquals(2.54, Unit.INCH.convert(1));
    }

    @Test
    void expectConversionFromKilogramsToGram() {
        assertEquals(1000, Unit.KILOGRAM.convert(1));
    }

    @Test
    void expectConversionFromPoundToGram() {
        assertEquals(453.5, Unit.POUND.convert(1));
    }
}