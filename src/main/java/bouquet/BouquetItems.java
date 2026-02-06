package bouquet;

/**
 * Abstract base class for all bouquet items.
 * Represents common properties such as name and price.
 */
public abstract class BouquetItems {

    /** Name of the item */
    protected String name;

    /** Price of the item */
    protected double price;

    /**
     * Constructs a bouquet item with given name and price.
     *
     * @param name  item name
     * @param price item price
     */
    public BouquetItems(String name, double price){
        this.name = name;
        this.price = price;
    }

    /**
     * Default protected constructor.
     */
    protected BouquetItems() {
    }

    /**
     * Returns item price.
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets item price.
     *
     * @param price new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns item name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets item name.
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }
}
