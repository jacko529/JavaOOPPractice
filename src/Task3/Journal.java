package Task3;

/**
 * The Journal class is to create new Journal objects inheritenting features from
 * the LibraryOffering class.
 * 3 types of constructors available, default constructor for manually invoking
 * instances and methods separately. Two types of parameterised methods are available
 * one for one library offering creator and another for two.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class Journal extends Task3.LibraryOffering
{
    // variable to hold the name of the jounrnal.
    private String JournalName;
    // variable to hold the volume number of the jounrnal.
    private String VolumeNumber;
    // variable to hold issue number.
    private String JournalIssueNumber;

    /**
     * Default Constructor Method
     * set's {@see #JournalName} to null.
     * set's {@see #VolumeNumber} to null.
     * set's {@see #JournalIssueNumber} to null.
     */
    public Journal()
    {
        this.JournalName = null;
        this.VolumeNumber = null;
        this.JournalIssueNumber = null;
    }


    /**
     * Constructor for objects of class Journal
     * This is the constructor for the book class.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #Creator}. @param {@link #CreatorIn}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #JournalName}. @param {@link #JournalNameIn}.
     * Set {@see #VolumeNumber}. @param {@link #VolumeNumberIn}.
     * Set {@see #JournalIssueNumber}. @param {@link #JournalIssueNumberIn}.
     */
    public Journal(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, boolean inStockIn, String JournalNameIn, String VolumeNumberIn, String IssueNumberIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, inStockIn);// initialise instance variables
        this.JournalName = JournalNameIn;
        this.VolumeNumber = VolumeNumberIn;
        this.JournalIssueNumber = JournalIssueNumber;
    }

    /**
     * Constructor for objects of class Journal
     * This is second constructor for the book class incase two creators are required.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorInTwo}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #JournalName}. @param {@link #JournalNameIn}.
     * Set {@see #VolumeNumber}. @param {@link #VolumeNumberIn}.
     * Set {@see #JournalIssueNumber}. @param {@link #JournalIssueNumberIn}.
     */
    public Journal(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, String CreatorInTwo,
                   boolean inStockIn, String JournalNameIn, String VolumeNumberIn, String JournalIssueNumberIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, CreatorInTwo, inStockIn);// initialise instance variables
        this.JournalName = JournalNameIn;
        this.VolumeNumber = VolumeNumberIn;
        this.JournalIssueNumber = JournalIssueNumberIn;
    }

    /**
     * Get {@see #VolumeNumber}. @return {@link #VolumeNumber}.
     */
    public String getVolumeNumber() {
        return VolumeNumber;
    }

    /**
     * Set {@see #VolumeNumber}. @param {@link #VolumeNumberIn}.
     */
    public void setVolumeNumber(String VolumeNumberIn) {
        this.VolumeNumber = VolumeNumberIn;
    }

    /**
     * Get {@see #JournalName}. @param {@link #JournalName}.
     */
    public String getJournalName() {
        return JournalName;
    }

    /**
     * Set {@see #JournalName}. @param {@link #JournalNameIn}.
     */
    public void setJournalName(String JournalNameIn) {
        this.JournalName = JournalNameIn;
    }

    /**
     * Get {@see #IssueNumber}. @return {@link #IssueNumber}.
     */
    public String getJournalIssueNumber() {
        return JournalIssueNumber;
    }

    /**
     * Set {@see #JournalIssueNumber}. @param {@link #JournalIssueNumberIn}.
     */
    public void setJournalIssueNumber(String JournalIssueNumberIn) {
        this.JournalIssueNumber = JournalIssueNumberIn;
    }
}
