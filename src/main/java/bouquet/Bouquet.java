package bouquet;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents a bouquet consisting of flowers and accessories.
 * Provides functionality for assembling, sorting and searching.
 */
public class Bouquet {

    private Flower[] flowers;
    private Accessory[] accessories;
    private BouquetItems[] bouquet;


    /**
     * Calculates total price of bouquet items.
     *
     * @param bouquet bouquet items
     * @return total price
     */
    public double getTotalPrice(BouquetItems[] bouquet){
        double priceCount = 0.0;
        for (BouquetItems item : bouquet){
            priceCount += item.getPrice();
        }
        return priceCount;
    }

    /**
     * Sorts flowers by freshness.
     *
     * @param flowers array of flowers
     * @return sorted flowers array
     */
    public Flower[] freshnessSort(Flower[] flowers){
        Flower[] sortedFlowers = flowers.clone();
        Arrays.sort(sortedFlowers, Comparator.comparing(Flower::isFreshness).reversed());
        return sortedFlowers;
    }

    /**
     * Creates bouquet from flowers and accessories.
     *
     * @param flowers flower array
     * @param accessories accessory array
     * @return bouquet items array
     */
    public BouquetItems[] createBouquet(Flower[] flowers, Accessory[] accessories) {
        if (flowers == null || accessories == null) {
            throw new IllegalArgumentException("Flowers or accessories cannot be null");
        }
        BouquetItems[] bouquet = new BouquetItems[flowers.length + accessories.length];
        int index = 0;

        for (Flower flower : flowers) {
            bouquet[index++] = flower;
        }
        for (Accessory accessory : accessories) {
            bouquet[index++] = accessory;
        }
        return bouquet;
    }


    /**
     * Finds and prints flowers within given stem length range.
     *
     * @param flowers flower array
     * @param fromStemLength minimum stem length
     * @param toStemLength maximum stem length
     */
    public void findFlower(Flower[] flowers,
                           double fromStemLength,
                           double toStemLength) {

        boolean found = false;
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= fromStemLength
                    && flower.getStemLength() <= toStemLength) {

                System.out.println("Object found:");
                System.out.println(flower);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Object not found");
        }
    }
}
