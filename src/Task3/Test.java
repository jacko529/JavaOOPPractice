package Task3;

/**
 * The test class for the library application.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class Test
{
    public static void main(String args[])
    {



        //Book newBookTest = new Book("The Best Book", 52.36, "20/04/2018", "Jack Churchill",true,  "662d6fd25", "662dee6fd-25", "1st");
   /*


// parameterised
*/
        //   Book newBook = new Book("The Best Book", 52.36, "20/04/2018", "Jack Churchill",true,  "662d6fd25", "662d6fd-25", "1st");
        // Dvd newDVD = new Dvd("The Best film", 5.36, "01/09/2018", "Dave Johnson", true,  "12A", "Horror", 167);
        // Journal newJournal = new Journal("The  Java study", 9.00, "17/02/2013", "Frank",true,  "The Java times", "54f", "4");
        //   Magazine newMagazine = new Magazine("National Geo", 10.36, "01/01/2018", "National", "Jack",  true, "Educational", "5");
        //       Book newBookSecond = new Book("The Best Book", 52.36, "20/04/2018","Jack Churchill","Jacko Packo", true,  "662d6fd25", "662d6fd-25", "1st");
        //  System.out.println("The parameterised value of creatorList is : - "+ newBookSecond.getCreatorList());
        //    System.out.println("The parameterised value of title is : - "+ newBook.getTitle());
        //    System.out.println("The parameterised value of customer name is : - "+ newBook.getCustomerName());
        //   System.out.println("The parameterised value of price is : - "+ newBook.getPrice());
        //        System.out.println("The parameterised value of date brought is : - "+ newBook.getDateBrought());
        //       System.out.println("The parameterised value of in stock is : - "+ newBook.getInStock());
        //       System.out.println("The parameterised value of isbn 13 is : - "+ newBook.getIsbn13());
        //       System.out.println("The parameterised value of isbn 1- is : - "+ newBook.getIsbn10());



         /*
        Book newBookDoubleList = new Book("The Best Book", 52.36,
                                            "20/02/2018", "Jack Churchill","Jacko Packo", true,
                                            "662d6fd25", "662d6fd-25", "1st");
        System.out.println("The default value of creator list is : - "+ newBookDoubleList.getCreatorList());
        newBookDoubleList.setCreatorList("25/01/2010", "Dave Churchill");
        System.out.println("The updated value of creator list is : - "+ newBookDoubleList.getCreatorList());
        newBookDoubleList.setCreatorList("Jim Jam", "Dave Churchill");
        System.out.println("The new updated value of creator list is : - "+ newBookDoubleList.getCreatorList());
  //    Dvd newDVDIncorrectCert = new Dvd("The Best film", 5.36, "01/09/2018", "Dave Johnson", true,  "1", "Horror", 167);



// getters and setters
        // title
        System.out.println("The default value of title is : - "+ newBookDefault.getTitle());
        newBookDefault.setTitle();
        System.out.println("The new value of title is : - "+ newBookDefault.getTitle());

        System.out.println("The default value of customer name is : - "+ newBookDefault.getCustomerName());
        System.out.println("The default value of price is : - "+ newBookDefault.getPrice());
        System.out.println("The default value of date brought is : - "+ newBookDefault.getDateBrought());
        System.out.println("The default value of in stock is : - "+ newBookDefault.getInStock());
        System.out.println("The default value of isbn 13 is : - "+ newBookDefault.getIsbn13());
        System.out.println("The default value of isbn 1- is : - "+ newBookDefault.getIsbn10());
        System.out.println("The default value of edition is : - "+ newBookDefault.getEdition());
        System.out.println("The default value of creator list is : - "+ newBookDefault.getCreatorList());

       System.out.println("The default value of hasTenant: " + AnAddressDefault.getHasTenant());
       AnAddressDefault.setHasTenant(true);
       System.out.println("The value of HasTenent is : " + AnAddressDefault.getHasTenant());









       /*
        newBook.takeOutPublication("jess", "03/04/2018",  "20/04/2018");
        System.out.println("The new value of CustomerName is : - "+ newBook.getCustomerName() + "\n");
        System.out.println("The new value of DateTakenOut is : - "+ newBook.getDateTakenOut() + "\n");
        System.out.println("The new value of DateDue is : - "+ newBook.getDateDue() + "\n");
        System.out.println("The new value of inStock is : - "+ newBook.getInStock() + "\n");
        */


              /*
        // late return
        newBookTest.returnPublication("05/04/2018");
        // on time return
        newBookTest.returnPublication("03/04/2018");
        // early return
        newBookTest.returnPublication("01/04/2018");

         Book newBookTest = new Book("The Best Book", 52.36, "20/04/2018", "Jack Churchill",true,  "662d6fd25", "662d6fd-25", "1st");
        System.out.println("The first value of Creator is: - "+ newBookTest.getCreatorList());
        newBookTest.addCreator("Jack Frank");
        System.out.println("The new value of creator is : - "+ newBookTest.getCreatorList () + "\n");
        newBookTest.addCreator("Jack Frank");
        System.out.println("The new value of creator is : - "+ newBookTest.getCreatorList () + "\n");
        newBookTest.addCreator("Jack Label");
        System.out.println("The new value of creator is : - "+ newBookTest.getCreatorList () + "\n");
        newBookTest.removeCreator();
        System.out.println("The new value of creator when removing a creator : - "+ newBookTest.getCreatorList () + "\n");
        newBookTest.removeCreator();
        newBookTest.removeCreator();
        newBookTest.removeCreator();
        System.out.println("The new value of creator when removing all creators : - "+ newBookTest.getCreatorList () + "\n");
           /*

         newBookTest.takeOutPublication("jess", "23/04/2018",  "03/04/2018");
        System.out.println("The new value of date due is : - "+ newBookTest.getDateDue() + "\n");
         System.out.println("The new value of date taken out is : - "+ newBookTest.getDateTakenOut() + "\n");
        System.out.println("The new value of customer nam is : - "+ newBookTest.getCustomerName() + "\n");
        System.out.println("The new value of in stock is : - "+ newBookTest.getInStock() + "\n");

         newBookTest.returnPublication("23/04/2018");
/*/
        Journal newJournal = new Journal("Smart Things", 12.36, "20/04/2018", "Jack Churchill", true, "Jorunal forever", "65g", "8");


        System.out.println("The first value of validateDate is : - "+ newJournal.validateDate("23/04/2018"));
        System.out.println("The second value of validateDate is : - "+ newJournal.validateDate(""));
        System.out.println("The third value of validateDate is : - "+ newJournal.validateDate("23/042018"));
/*
          Dvd newDvd = new Dvd("Anchor Man", 142.36, "20/04/2018", "Jack Churchill", true, "U", "Comemdy", 128);
          newDvd.takeOutPublication("Jim", "23/04/2018", "03/04/2018");
          newDvd.returnPublication("23/04/2018");

          Magazine newMagazine = new Magazine("National Geo", 10.30, "20/04/2018", "National Geo", true, "documentary", "3");
          newMagazine.takeOutPublication("Tim", "23/04/2018",  "03/04/2018");
          newMagazine.returnPublication("23/04/2018");
        /*

                Book newBookDefault = new Book();
        Journal newJournalDefault = new Journal();
        Dvd newDvdDefault = new Dvd();
        Magazine newMagazineDefault = new Magazine();


        // date returned
/*




        newDvdDefault.setCertification("jack");
        System.out.println("The second value of Certification is : - "+ newDvdDefault.getCertification() + "\n");
        newDvdDefault.setCertification("15");
        System.out.println("The correct value of Certification is : - "+ newDvdDefault.getCertification() + "\n");
        */









        //

        /*
        System.out.println("The first value of VolumeNumber is: - "+ newMagazineDefault.getMagazineGenre());
        newMagazineDefault.setMagazineGenre("Computing");
        System.out.println("The new value of VolumeNumber is : - "+ newMagazineDefault.getMagazineGenre() + "\n");

        //System.out.println(newBookDefault(getDateBrought();
        //System.out.println("hrllo" + newBook.getDateBrought());


        */
    }
}
