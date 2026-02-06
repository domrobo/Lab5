package bouquet;

/**
 * Represents a rose flower.
 */
public class Rose extends Flower {

    /** Indicates presence of thorns */
    private boolean hawthorns;

    /**
     * Constructs a rose with thorns information.
     */
    public Rose(String name, double price, double length, boolean freshness, boolean hawthorns) {
        super(name, price, length, freshness);
        this.hawthorns = hawthorns;
    }

    /**
     * Constructs a rose without specifying thorns.
     */
    public Rose(String name, double price, double length, boolean freshness){
        super(name, price, length, freshness);
    }

    /**
     * Returns whether rose has thorns.
     *
     * @return true if it has thorns
     */
    public boolean isHawthorns() {
        return hawthorns;
    }

    /**
     * Sets thorns presence.
     *
     * @param hawthorns thorns state
     */
    public void setHawthorns(boolean hawthorns) {
        this.hawthorns = hawthorns;
    }
}
