package lab5;

import bouquet.*;

/**
 * Entry point of the application.
 * Demonstrates creation of flowers and accessories,
 * bouquet assembling, price calculation, sorting and searching.
 */
public class Main {

    /**
     * Main method that runs the bouquet demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create flowers
        Flower[] flowers = new Flower[] {
                new Rose("Rose", 100.0, 40.0, true, true),
                new Tulip("Tulip", 70.0, 30.0, false, "Oval"),
                new Rose("Rose", 120.0, 50.0, true)
        };

        // Create accessories
        Accessory[] accessories = new Accessory[] {
                new Accessory("Paper wrap", 20.0),
                new Accessory("Ribbon", 15.0, "Silk", "Red")
        };

        // Create bouquet
        Bouquet bouquet = new Bouquet();
        BouquetItems[] bouquetItems = bouquet.createBouquet(flowers, accessories);

        // Output bouquet items
        System.out.println("Bouquet items");
        for (BouquetItems item : bouquetItems) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        // Calculate total price
        double totalPrice = bouquet.getTotalPrice(bouquetItems);
        System.out.println("\nTotal price: " + totalPrice);

        // Sort flowers by freshness
        System.out.println("\nFlowers sorted by freshness");
        Flower[] sortedFlowers = bouquet.freshnessSort(flowers);
        for (Flower flower : sortedFlowers) {
            System.out.println(flower.getName() + " | fresh: " + flower.isFreshness());
        }

        // Search flower by stem length
        System.out.println("\nSearch flower by stem length (35 - 55)");
        bouquet.findFlower(flowers, 35.0, 55.0);
    }
}
