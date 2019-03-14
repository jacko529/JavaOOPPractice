package Task3;


/**
 * The provided interface class for the library application.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public interface Publishable
{
    /**
     * Set a publication's title
     *
     * @param titleIn  The name of a publication
     */
    public void setTitle(String titleIn);



    /**
     * Set a publication's price
     *
     * @param priceIn  The price of a publication
     */
    public void setPrice(double priceIn);


    /**
     * Get a publication's title
     *
     * @return The publication title
     */
    public String getTitle();



    /**
     * Get a publication's price
     *
     * @return The price of a publication
     */
    public double getPrice();

}
