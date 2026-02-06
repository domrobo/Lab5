package bouquet;

/**
 * Represents an accessory used in a bouquet.
 */
public class Accessory extends BouquetItems {

    /** Material of accessory */
    private String material;

    /** Color of accessory */
    private String color;

    /**
     * Constructs accessory with default material and color.
     */
    public Accessory(String name, double price) {
        super(name, price);
        this.color = "White";
        this.material = "Paper";
    }

    /**
     * Constructs accessory with custom material and color.
     */
    public Accessory(String name, double price, String material, String color){
        super(name, price);
        this.material = material;
        this.color = color;
    }

    /**
     * Returns material.
     *
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets material.
     *
     * @param material new material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Returns color.
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color new color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
