package Task3;

import java.util.Date;
/**
 * Class for book, this extends the parent abstract class of LibraryOfferings.
 * This class is used to create book objects.
 *
 *
 *3 types of constructors available, default constructor for manually invoking
 * instances and methods separately. Two types of parameterised methods are available
 * one for one library offering creator and another for two.
 *  @author Jack Churchill
 * @version 1.0
 */
public class Book extends LibraryOffering
{
    // variable to hold the name of the Isbn version 10.
    private String Isbn10;
    // variable to hold the name of the Isbn verion 13.
    private String Isbn13;
    // variable to hold the name/number of the edition.
    private String Edition;

    /**
     * Default Constructor Method
     * set's {@see #Isbn10} to null.
     * set's {@see #Isbn13} to null.
     * set's {@see #Edition} to null
     */
    public Book()
    {
        this.Isbn10 = null;
        this.Isbn13 = null;
        this.Edition = null;
    }

    /**
     * This is the constructor for the book class.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #Isbn10}. @param {@link #Isbn10In}. Setting the ISBN-10 of a book.
     * Set {@see #Isbn13}. @param {@link #Isbn13In}. Setting the ISBN-13 of a book.
     * Set {@see #Edition}. @param {@link #EditionIn}. Setting the edition of a book.
     */
    public Book(String titleIn, double priceIn, String dateBroughtIn,
                String CreatorIn, boolean inStockIn, String Isbn10In, String Isbn13In, String EditionIn)
    {
        super(titleIn,priceIn,dateBroughtIn,CreatorIn, inStockIn);
        this.Isbn10 = Isbn10In;
        this.Isbn13 = Isbn13In;
        this.Edition = EditionIn;
    }

    /**
     * This is the second constructor for the book class if two authors are required.
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorInTwo}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Set {@see #Isbn10}. @param {@link #Isbn10In}. Setting the ISBN-10 of a book.
     * Set {@see #Isbn13}. @param {@link #Isbn13In}. Setting the ISBN-13 of a book.
     * Set {@see #Edition}. @param {@link #EditionIn}. Setting the edition of a book.
     */
    public Book(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, String CreatorInTwo,
                boolean inStockIn, String Isbn10In, String Isbn13In, String EditionIn)
    {
        super(titleIn, priceIn, dateBroughtIn, CreatorIn, CreatorInTwo, inStockIn);
        this.Isbn10 = Isbn10In;
        this.Isbn13 = Isbn13In;
        this.Edition = EditionIn;
    }

    /**
     * Set {@see #Isbn10}. @param {@link #Isbn10In}.
     * Setting the ISBN-10 of the book.
     */
    public void setIsbn10(String Isbn10In)
    {
        this.Isbn10 = Isbn10In;
    }

    /**
     * Get {@see #Isbn10}. @return {@link #Isbn10}.
     * Getting the ISBN-10 of the book.
     */
    public String getIsbn10()
    {
        return this.Isbn10;
    }

    /**
     * Set {@see #Isbn13}. @param {@link #Isbn13In}.
     * Setting the ISBN-13 of the book.
     */
    public void setIsbn13(String Isbn13In)
    {
        this.Isbn13 = Isbn13In;
    }

    /**
     * Get {@see #Isbn13}. @return {@link #Isbn13}.
     * Getting the ISBN-13 of the book.
     */
    public String getIsbn13()
    {
        return this.Isbn13;
    }

    /**
     * Set {@see #Edition}. @param {@link #EditionIn}.
     * Setting the edition of the book.
     */
    public void setEdition(String Isbn13In)
    {
        this.Edition = Isbn13In;
    }

    /**
     * Get {@see #Edition}. @return {@link #EditionIn}.
     * Getting the edition of the book.
     */
    public String getEdition()
    {
        return Edition;
    }
}
