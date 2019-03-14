package Task3;


/**
 * The Magazine class is to create new Magazine objects inheritenting features from
 * the LibraryOffering class.

 *3 types of constructors available, default constructor for manually invoking
 * instances and methods separately. Two types of parameterised methods are available
 * one for one library offering creator and another for two.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class Magazine extends Task3.LibraryOffering
{
    // variable to hold the name of the magazine genre.
    private String MagazineGenre;
    // variable to hold the name of the issue number.
    private String issueNumber;

    /**
     * Default Constructor Method.
     * set's {@see #MagazineGenre} to null.
     * set's {@see #issueNumber} to null.
     */
    public Magazine()
    {
        this.MagazineGenre = null;
        this.issueNumber = null;
    }

    /**
     * Constructor for objects of class Dvd
     * This is the constructor for the book class.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #Creator}. @param {@link #CreatorIn}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #MagazineGenre}. @param {@link #MagazineGenreIn}.
     * Set {@see #issueNumber}. @param {@link #issueNumberIn}.
     */
    public Magazine(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn,
                    boolean inStockIn, String MagazineGenreIn, String issueNumberIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, inStockIn);
        this.MagazineGenre = MagazineGenreIn;
        this.issueNumber = issueNumberIn;
    }

    /**
     * Constructor for objects of class Dvd
     * This is the second constructor for the magazine class in case two creators are required.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorInTwo}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #MagazineGenre}. @param {@link #MagazineGenreIn}.
     * Set {@see #issueNumber}. @param {@link #issueNumberIn}.
     */
    public Magazine(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, String CreatorInTwo,
                    boolean inStockIn, String MagazineGenreIn, String issueNumberIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, inStockIn);
        this.MagazineGenre = MagazineGenreIn;
        this.issueNumber = issueNumberIn;
    }

    /**
     * Get {@see #MagazineGenre}. @param {@link #MagazineGenre}.
     */
    public String getMagazineGenre() {
        return MagazineGenre;
    }

    /**
     * Set {@see #issueNumber}. @param {@link #issueNumberIn}.
     */
    public void setIssueNumber(String issueNumberIn) {
        this.issueNumber = issueNumberIn;
    }

    /**
     * Get {@see #issueNumber}. @return {@link #issueNumber}.
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Set {@see #MagazineGenre}. @param {@link #MagazineGenreIn}.
     */
    public void setMagazineGenre(String MagazineGenreIn) {
        this.MagazineGenre = MagazineGenreIn;
    }
}
