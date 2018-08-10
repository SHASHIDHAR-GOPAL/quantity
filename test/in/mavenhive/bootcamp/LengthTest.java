package in.mavenhive.bootcamp;
import org.junit.jupiter.api.Test;

import static in.mavenhive.bootcamp.Quantity.*;
import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void expectOneMeterToBeEqualToOneMeter() {
        assertEquals(meter(1), meter(1));
    }

    @Test
    void expectOneCentimeterToBeEqualToOneCentimeter() {
        assertEquals(centimeter(1), centimeter(1));
    }

    @Test
    void expectOneInchToBeEqualToOneInch() {
        assertEquals(inch(1), inch(1));
    }

    @Test
    void expectOneMeterToBeEqualToOneHundredCentimeter() {
        assertEquals(meter(1), centimeter(100));
    }

    @Test
    void expectOneInchToBeEqualToTwoPointFiveFourCentimeter() {
        assertEquals(inch(1), centimeter(2.54));
    }

}