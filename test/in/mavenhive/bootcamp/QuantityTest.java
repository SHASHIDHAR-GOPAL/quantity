package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static in.mavenhive.bootcamp.Quantity.*;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    
    @Test
    void expectLengthOfTwoMeterToBeEqualToLengthOfTwoMeter() {
        assertEquals(meter(2), meter(2));
    }

    @Test
    void expectLengthOfTwoInchToBeEqualToTwoInch() {
        assertEquals(inch(2), inch(2));
    }

    @Test
    void expectLengthOfOneInchToBeEqualToTwoPointFiveFourCentimeter() {
        assertEquals(inch(1), centimeter(2.54));
    }

    @Test
    void expectLengthOfOneMeterToBeEqualToOneHundredCentimeter() {
        assertEquals(meter(1), centimeter(100));
    }

    @Test
    void expectWeightOfOneGramToBeEqualToOneGram() {
        assertEquals(gram(1), gram(1));
    }

    @Test
    void expectWeightTwoKgToBeEqualToTwoKg() {
        assertEquals(kilogram(2), kilogram(2));
    }

    @Test
    void expectWeightOnePoundToBeEqualToOnePound() {
        assertEquals(pound(1), pound(1));
    }

    @Test
    void expectWeightOfOneKgToBeEqualToThousandGram() {
        assertEquals(kilogram(1), gram(1000));
    }

    @Test
    void expectWeightOfTwoPoundToBeEqualNineZeroSevenGrams() {
        assertEquals(pound(2), gram(907));
    }

    @Test
    void expectFalseGivenOneKgAndOneMeter() {
        assertNotEquals(kilogram(1), meter(1));
    }
}