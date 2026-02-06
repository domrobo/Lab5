package bouquet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void testRoseCreation() {
        Rose rose = new Rose("Rose", 120.0, 50.0, true, true);

        assertEquals("Rose", rose.getName());
        assertEquals(120.0, rose.getPrice());
        assertEquals(50.0, rose.getStemLength());
        assertTrue(rose.isFreshness());
        assertTrue(rose.isHawthorns());
    }

    @Test
    void testTulipCreation() {
        Tulip tulip = new Tulip("Tulip", 70.0, 30.0, false, "Oval");

        assertEquals("Tulip", tulip.getName());
        assertEquals(70.0, tulip.getPrice());
        assertEquals(30.0, tulip.getStemLength());
        assertFalse(tulip.isFreshness());
        assertEquals("Oval", tulip.getBudShape());
    }

    @Test
    void testStemLengthChange() {
        Flower flower = new Rose("Rose", 100.0, 40.0, true);

        flower.setStemLength(55.0);

        assertEquals(55.0, flower.getStemLength());
    }


}
