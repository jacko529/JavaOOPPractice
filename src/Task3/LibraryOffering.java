
package Task3;

import java.time.temporal.ChronoUnit;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
/**
 * Abstract class LibraryOfferings - this class has all of the common features and attributes of all publications.
 * This class includes how the user takes ot and returns publications
 * Each new object created is a new publication
 * @author Jack Churchill
 * @version 1.0
 */
public abstract class LibraryOffering implements Task3.Publishable
{
    // a variable to define the tile of a publication.
    private String Title;
    // a variable to define the price of a publication.
    private double Price;
    // a variable to define the boolean value if apublication is in stock.
    private boolean inStock;
    // a variable to define when a publication is due.
    private String DateDue;
    // a variable to define when a publication is taken out .
    private String DateTakenOut;
    // a variable to define when a publication is returned.
    private String DateReturned;
    // a variable to define when a publication is brought.
    private String DateBrought;
    // an arraylist to define what a publication creators name is - setting the list to the size of two.
    private ArrayList<String> CreatorList = new ArrayList<String>(2);
    // a variable to define what the customer name who took out the publication.
    private String CustomerName;
    /**
     * Variable to clarify the format of a date.
     */
    DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    /**
     * Constructor to set all values as null, 0 or false.
     * Set {@see #Title} to null.
     * Set {@see #Price} to 0.
     * Set {@see #DateBrought} to null.
     * Set {@see #CreatorList} to 0/null.
     * Set {@see #inStock} to false.
     */
    public LibraryOffering()
    {
        this.Title = null;
        this.Price = 0;
        this.DateBrought = null;
        // when default constructor is constructed the arraylist is trimmed to 1.
        this.CreatorList.trimToSize();
        this.inStock = false;
    }


    /**
     * Constructor to set all params for the abstract class
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Some value set direct variables, the date values must run throught their setter methods to invoke date validation.
     */
    public LibraryOffering(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, boolean inStockIn)
    {
        this.Title = titleIn;
        this.Price = priceIn;
        setDateBrought(dateBroughtIn);
        // add the creator the to array list
        CreatorList.add(CreatorIn);
        // trim the array list to one.
        CreatorList.trimToSize();
        this.inStock = inStockIn;
    }


    /**
     * Second constructor to add two creators of the publication.
     *
     * Constructor to set all params for the abstract class
     * Set {@see #Title}. @param {@link #titleIn}.
     * Set {@see #Price}. @param {@link #priceIn}.
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Set {@see #CreatorList}. @param {@link #CreatorIn}.
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Some value set direct variables, the date values must run throught their setter methods to invoke date validation.
     */
    public LibraryOffering(String titleIn, double priceIn, String dateBroughtIn, String CreatorIn, String CreatorInTwo, boolean inStockIn)
    {
        this.Title = titleIn;
        this.Price = priceIn;
        setDateBrought(dateBroughtIn);
        // add the creator the to array list
        CreatorList.add(CreatorIn);
        // add the second creator the to array list
        CreatorList.add(CreatorInTwo);
        // trim the array list to two.
        CreatorList.trimToSize();
        this.inStock = inStockIn;
    }

    /**
     * Set {@see #Title}. @param {@link #titleIn}.
     * Setting the title of a publication.
     */
    public void setTitle(String titleIn)
    {
        this.Title = titleIn;
    }

    /**
     * Set {@see #Price}. @param {@link #priceIn}.
     * Setting the price of a publication.
     */
    public void setPrice(double priceIn)
    {
        this.Price = priceIn;
    }

    /**
     * Set {@see #DateBrought}. @param {@link #dateBroughtIn}.
     * Setting the date a publication was brought.
     * Validating the entry to ensure the correct date format is given.
     */
    public void setDateBrought(String dateBroughtIn)
    {
        validateDate(dateBroughtIn);
        if(validateDate(dateBroughtIn) == true){
            this.DateBrought = dateBroughtIn;
        }
        else{
            System.out.println("please enter a date format of DD-MM-YYYY");
        }
    }
    /**
     * @param AddtionalCreator
     * A method to add an addtional creator if more than two is required.
     * trims the arraylist to the current size of the array.
     */
    public void addCreator(String AddtionalCreator)
    {
        CreatorList.add(AddtionalCreator);
        CreatorList.trimToSize();
    }

    /**
     * @return CreatorList
     * Remove the last item added to the creatorlist.
     * Trims the arraylist to the current size of the array
     */
    public ArrayList removeCreator()
    {
        CreatorList.remove(CreatorList.size() - 1);
        CreatorList.trimToSize();
        return CreatorList;
    }

    /**
     * Set {@see #CreatorList}. @param {@link #CreatorOne}. @param {@link #CreatorTwo}.
     * Setting the name of the publication creator, this means author or producer.
     * The setter clears all items from the list and allows the user to re enter creators into the list
     * Then trims the list back to size.
     */
    public void setCreatorList(String CreatorOne, String CreatorTwo)
    {
        CreatorList.clear();
        CreatorList.add(CreatorOne);
        CreatorList.add(CreatorTwo);
        CreatorList.trimToSize();
    }

    /**
     * Set {@see #DateTakenOut}. @param {@link #DateTakenOutIn}.
     * Setting the date a publication was taken out.
     * Validating the entry to ensure the correct date format is given.
     */
    public void setDateTakenOut(String DateTakenOutIn)
    {
        validateDate(DateTakenOutIn);
        if(validateDate(DateTakenOutIn) == true){
            this.DateTakenOut = DateTakenOutIn;
        }
        else{
            System.out.println("please enter a date format of DD/MM/YYYY");
        }
    }

    /**
     * Set {@see #DateReturned}. @param {@link #DateReturnedIn}.
     * Setting the date a publication was taken out.
     * Validating the entry to ensure the correct date format is given.
     */
    public void setDateReturned(String DateReturnedIn)
    {
        validateDate(DateReturnedIn);
        if(validateDate(DateReturnedIn) == true){
            this.DateReturned = DateReturnedIn;
        }
        else{
            System.out.println("please enter a date format of DD/MM/YYYY");
        }
    }

    /**
     * Set {@see #inStock}. @param {@link #inStockIn}.
     * Setting a boolean value if a publication is in stock.
     */
    public void setInStock(boolean inStockIn)
    {
        this.inStock = inStockIn;
    }

    /**
     * Set {@see #CustomerName}. @param {@link #CustomerNameIn}.
     * Setting a boolean value if a publication is in stock.
     */
    public void setCustomerName(String CustomerNameIn)
    {
        this.CustomerName = CustomerNameIn;
    }

    /**
     * Set {@see #DateDue}. @param {@link #DateDueIn}.
     * Setting the date a publication is due.
     * Validating the entry to ensure the correct date format is given.
     */
    public void setDateDue(String DateDueIn)
    {
        validateDate(DateDueIn);
        if(validateDate(DateDueIn) == true){
            this.DateDue = DateDueIn;
        }
        else{
            System.out.println("please enter a date format of DD/MM/YYYY");
        }
    }

    /**
     * Get {@see #Price}. @return {@link #Price}.
     * Getting the price of a publication.
     */
    public double getPrice()
    {
        return this.Price;
    }

    /**
     * Get {@see #DateDue}. @return {@link #DateDue}.
     * Getting the date a publication is due.
     */
    public String getDateDue()
    {
        return DateDue;
    }

    /**
     * Get {@see #Title}. @return {@link #Title}.
     * Getting the title of a publication.
     */
    public String getTitle()
    {
        return Title;
    }

    /**
     * Get {@see #DateBrought}. @return {@link #DateBrought}.
     * Getting the date a publication was brought.
     */
    public String getDateBrought()
    {
        return DateBrought;
    }

    /**
     * Get {@see #CreatorList}. @return {@link #CreatorList}.
     * Getting the name of a publications creator/s.
     */
    public ArrayList getCreatorList()
    {
        return CreatorList;
    }

    /**
     * Get {@see #DateReturned}. @return {@link #DateReturned}.
     * Getting the date of a publication was returned.
     */
    public String getDateReturned()
    {
        return DateReturned;
    }

    /**
     * Get {@see #DateTakenOut}. @return {@link #DateTakenOut}.
     * Getting the date of a publication was taken out.
     */
    public String getDateTakenOut()
    {
        return DateTakenOut;
    }

    /**
     * Get {@see #inStock}. @return {@link #inStock}.
     * Getting the boolean value if a publication is in stock.
     */
    public boolean getInStock()
    {
        return inStock;
    }

    /**
     * Get {@see #CustomerName}. @return {@link #CustomerName}.
     * Getting the name of a customer who took out a publication.
     */
    public String getCustomerName()
    {
        return CustomerName;
    }

    /**
     * Set {@see #CustomerName}. @param {@link #CustomerNameIn}.
     * Set {@see #DateDue}. @param {@link #DateDueIn}.
     * Set {@see #DateTakenOut}. @param {@link #DateTakenOutIn}.
     * Set {@see #inStock} to false.
     * Method for taking out a publication.
     */
    public void takeOutPublication(String CustomerNameIn, String DateDueIn, String DateTakenOutIn)
    {
        this.CustomerName = CustomerNameIn;
        setDateDue(DateDueIn);
        setDateTakenOut(DateTakenOutIn);
        this.inStock = false;
        System.out.println(getDateTakenOut() + "\n"+ getCustomerName() + " has a publication due in on " + getDateDue() );
    }

    /**
     * Method to call for returning a Publication. The method compares if the date returned is later than the date due,
     * if it is then it calculates how many days late and prints the result.
     * Sets inStock to true regardless if late or date.
     * Set {@see #DateReturned}. @param {@link #DateReturnedIn}.
     */
    public void returnPublication(String DateReturnedIn)
    {
        // Set the return date, so it can be validated.
        setDateReturned(DateReturnedIn);
        try
        {
            // convert date returned to a local date format
            LocalDate dateReturnedConverted = LocalDate.parse(getDateReturned(), simpleDateFormat);
            LocalDate dateDueInConverted = LocalDate.parse(getDateDue(), simpleDateFormat);
            // check if the converted date is after the converted date due.
            // print the customer, the title and the difference of days if publication is late.
            if (dateReturnedConverted.isAfter(dateDueInConverted)) {
                System.out.println(getCustomerName() + ", you have to pay a fine, " + getTitle() + " is " +
                        ChronoUnit.DAYS.between(dateDueInConverted, dateReturnedConverted) + " days late.");
            } else if (dateDueInConverted.isAfter(dateReturnedConverted)) {
                System.out.println(getCustomerName() + ", Thank you" + " for returning your book");
            }
            else if (dateReturnedConverted.equals(dateDueInConverted)) {
                System.out.println(getCustomerName() + ", Thank you" + " for returning your book, it was due today");
            }
        }
        catch (DateTimeParseException  e)
        {
            System.out.println("Could not parse this date");
        }
        setInStock(true);
    }

    /**
     * The param stands for anything date which needs to be validated.
     * The method checks if the entry is not null and that the date value is DD/MM/YYYY.
     * @param dateEntered.
     * @return boolean value if the date is valid.
     */
    public boolean validateDate(String dateEntered)
    {
        /* Check if date is 'null' */
        try {
            if (dateEntered.trim().equals(""))
            {
                return true;
            }


            /* Date is not 'null' */
            else
            {
                try
                {
                    LocalDate javaDate = LocalDate.parse(dateEntered, simpleDateFormat);
                }
                /* Date format is invalid */
                catch (DateTimeParseException e)
                {
                    return false;
                }

            }
        }
        catch(NullPointerException e) {
            System.out.print("Be careful for null pointers, you are calling a method on a null variable.");
        }
        /* Return true if date format is valid */
        return true;
    }
}
