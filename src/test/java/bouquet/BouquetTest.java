package bouquet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BouquetTest {

    @Test
    void testCreateBouquet() {
        Flower[] flowers = {
                new Rose("Rose", 100.0, 40.0, true),
                new Tulip("Tulip", 70.0, 30.0, false)
        };

        Accessory[] accessories = {
                new Accessory("Paper", 20.0)
        };

        Bouquet bouquet = new Bouquet();
        BouquetItems[] result = bouquet.createBouquet(flowers, accessories);

        assertEquals(3, result.length);
        assertInstanceOf(Flower.class, result[0]);
        assertInstanceOf(Accessory.class, result[2]);
    }

    @Test
    void testGetTotalPrice() {
        BouquetItems[] items = {
                new Rose("Rose", 100.0, 40.0, true),
                new Accessory("Ribbon", 15.0)
        };

        Bouquet bouquet = new Bouquet();
        double totalPrice = bouquet.getTotalPrice(items);

        assertEquals(115.0, totalPrice);
    }

    @Test
    void testFreshnessSort() {
        Flower fresh = new Rose("Rose", 100.0, 40.0, true);
        Flower notFresh = new Tulip("Tulip", 70.0, 30.0, false);

        Flower[] flowers = { fresh, notFresh };

        Bouquet bouquet = new Bouquet();
        Flower[] sorted = bouquet.freshnessSort(flowers);

        assertTrue(sorted[0].isFreshness());
        assertFalse(sorted[1].isFreshness());
    }
}
