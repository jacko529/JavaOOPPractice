package Task3;

/**
 * Class for Dvd, this extends the parent abstract LibraryOfferings.
 * This class is used to create DVD objects.
 *
 * 3 types of constructors available, default constructor for manually invoking
 * instances and methods separately. Two types of parameterised methods are available
 * one for one library offering creator and another for two.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class Dvd extends Task3.LibraryOffering
{
    // variable to hold the name of the certification.
    private String Certification;
    // variable to hold the name of the film category.
    private String Category;
    // variable to hold the length of run time.
    private double RuntimeInMinutes;

    /**
     * Default Constructor Method.
     * set's {@see #Certification} to null.
     * set's {@see #Category} to null.
     * set's {@see #RuntimeInMinutes} to null.
     */
    public Dvd()
    {
        this.Certification = null;
        this.Category = null;
        this.RuntimeInMinutes = 0;
    }

    /**
     * Constructor for objects of class Dvd
     * This is the constructor for the book class.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #Creator}. @param {@link #CreatorIn}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #Certification}. @param {@link #CertificationIn} ran through setCertification to ensure correct input.
     * Set {@see #Category}. @param {@link #CategoryIn}.
     * Set {@see #RuntimeInMinutes}. @param {@link #RuntimeInMinutesIn}.
     */
    public Dvd(String titleIn, double priceIn, String dateBroughtIn,
               String CreatorIn, boolean inStockIn, String CertificationIn, String CategoryIn, double RuntimeInMinutesIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, inStockIn);// initialise instance variables
        setCertification(CertificationIn);
        this.Category = CategoryIn;
        this.RuntimeInMinutes = RuntimeInMinutesIn;
    }

    /**
     * Constructor for objects of class Dvd
     * This is the second constructor for the DVD class if two creators are required.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorInTwo}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #Certification}. @param {@link #CertificationIn} ran through setCertification to ensure correct input.
     * Set {@see #Category}. @param {@link #CategoryIn}.
     * Set {@see #RuntimeInMinutes}. @param {@link #RuntimeInMinutesIn}.
     */
    public Dvd(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, String CreatorInTwo,
               boolean inStockIn, String CertificationIn, String CategoryIn, double RuntimeInMinutesIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, CreatorInTwo, inStockIn);// initialise instance variables
        setCertification(CertificationIn);
        this.Category = CategoryIn;
        this.RuntimeInMinutes = RuntimeInMinutesIn;
    }

    /**
     * Set {@see #Certification}. @param {@link #CertificationIn}.
     * This method sets the certification of a Dvd and validates that only valid certifications are entered.
     */
    public void setCertification(String CertificationIn) {
        // test if the input if only of a certain value
        // otherwise print the correct value and set value to null.
        if(CertificationIn.equals("U")||CertificationIn.equals("PG")||CertificationIn.equals("12A")||CertificationIn.equals("12")
                ||CertificationIn.equals("15")||CertificationIn.equals("18"))
        {
            Certification = CertificationIn;
        }
        else
        {
            Certification = null;
            System.out.println("Please insert either U, PG, 12A, 12, 15 or 18.");
        }

    }

    /**
     * Get {@see #Certification}. @return {@link #Certification}.
     */
    public String getCertification() {
        return Certification;
    }

    /**
     * Set {@see #Category}. @param {@link #CategoryIn}.
     */
    public void setCategory(String CategoryIn) {
        this.Category = CategoryIn;
    }

    /**
     * Get {@see #Category}. @return {@link #Category}.
     * @return Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * Set {@see #RuntimeInMinutes}. @param {@link #RuntimeInMinutesIn}.
     * logic to insure the runtime is not a negative number.
     */
    public void setRuntimeInMinutes(double RuntimeInMinutesIn)
    {
        if(RuntimeInMinutesIn < 0)
        {
            System.out.println("The runtime cannot be a negative number. The variable has not been set.");
        }
        else
        {
            this.RuntimeInMinutes = RuntimeInMinutesIn;
        }
    }

    /**
     * Get {@see #RuntimeInMinutes}. @return {@link #RuntimeInMinutes}.
     */
    public double getRuntimeInMinutes() {
        return RuntimeInMinutes;
    }
}
