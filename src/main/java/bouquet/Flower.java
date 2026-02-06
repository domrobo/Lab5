package bouquet;

/**
 * Abstract class representing a flower.
 * Extends BouquetItems with flower-specific properties.
 */
public abstract class Flower extends BouquetItems {

    /** Indicates whether the flower is fresh */
    protected boolean freshness;

    /** Stem length of the flower */
    protected double stemLength;

    /**
     * Constructs a flower with given parameters.
     *
     * @param name flower name
     * @param price flower price
     * @param stemLength stem length
     * @param freshness freshness state
     */
    public Flower(String name, double price, double stemLength, boolean freshness){
        super(name, price);
        this.stemLength = stemLength;
        this.freshness = freshness;
    }

    @Override
    public String toString(){
        return getName() + " - " + getPrice() +
                ", stem length: " + getStemLength() +
                ", fresh: " + isFreshness();
    }

    /**
     * Returns stem length.
     *
     * @return stem length
     */
    public double getStemLength() {
        return stemLength;
    }

    /**
     * Sets stem length.
     *
     * @param stemLength new stem length
     */
    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    /**
     * Sets freshness state.
     *
     * @param freshness freshness value
     */
    public void setFreshness(boolean freshness) {
        this.freshness = freshness;
    }

    /**
     * Returns freshness state.
     *
     * @return freshness
     */
    public boolean isFreshness() {
        return freshness;
    }

}
