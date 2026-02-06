package bouquet;

/**
 * Represents a tulip flower.
 */
public class Tulip extends Flower {

    /** Shape of the tulip bud */
    private String budShape;

    /**
     * Constructs a tulip with bud shape.
     */
    public Tulip(String name, double price, double stemLength, boolean freshness, String budShape){
        super(name, price, stemLength, freshness);
        this.budShape = budShape;
    }

    /**
     * Constructs a tulip without bud shape.
     */
    public Tulip(String name, double price, double stemLength, boolean freshness){
        super(name, price, stemLength, freshness);
    }

    /**
     * Returns bud shape.
     *
     * @return bud shape
     */
    public String getBudShape() {
        return budShape;
    }

    /**
     * Sets bud shape.
     *
     * @param budShape new bud shape
     */
    public void setBudShape(String budShape) {
        this.budShape = budShape;
    }
}
