package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static in.mavenhive.bootcamp.Quantity.*;
import static org.junit.jupiter.api.Assertions.*;

class WeightTest {

    @Test
    void expectOneGramToBeEqualToOneGram() {
        assertEquals(gram(1), gram(1));
    }

    @Test
    void expectOneKilogramToBeEqualToOneKiloGram() {
        assertEquals(kilogram(1), kilogram(1));
    }

    @Test
    void expectOnePoundToBeEqualToOnePound() {
        assertEquals(pound(1), pound(1));
    }

    @Test
    void expectOneKGToBeEqualToOneThousandGrams() {
        assertEquals(kilogram(1), gram(1000));
    }

    @Test
    void expectOnePoundToBeEqualToFourFiftyThreePointFiveGrams() {
        assertEquals(pound(1), gram(453.5));
    }

}