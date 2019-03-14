package Task1;

/**
 * The class for the instantiating the building objects, this class work in conjunction with the address class,
 * including an attribute for the address object.
 * Features in this class include the ability to print all of the details of the variables in a human readable format.
 * An ability to calculate the annual rent cost based off the monthly rent.
 * The user can also reset the address object if a mistake was made by calling setAddress.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class building
{
    // variable to hold the number of windows a property has.
    private int windows;
    // variable to hold the number of rooms a property has.
    private int rooms;
    // variable to hold the number of kitchens a property has.
    private int Kitchens;
    // variable to hold the number of baths a property has.
    private int Bathrooms;
    // variable to show if the property has a garden.
    private boolean hasGarden;
    // variable to show if the property has a balcony.
    private boolean hasBalcony;
    // variable to show if the property has a parking space.
    private boolean hasParkingSpace;
    // variable to hold if the property is a apartment.
    private boolean isApartment;
    // variable to hold if the property is a house.
    private boolean isHouse;
    // Has-a relationship with the address class
    private address Address = new address();

    /**
     * Default Constructor
     * set's {@see #windows} to 0.
     * set's {@see #rooms} to 0.
     * set's {@see #Kitches} to 0
     * set's {@see #Bathrooms} to 0.
     * set's {@see #hasGarden} to 0.
     * set's {@see #hasBalcony} to false
     * set's {@see #hasParkingSpace} to false
     * set's {@see #isApartment} to false
     * set's {@see #isHouse} to false
     */
    public building() {
        this.windows = 0;
        this.rooms = 0;
        this.Kitchens = 0;
        this.Bathrooms = 0;
        this.hasGarden = false;
        this.hasBalcony = false;
        this.hasParkingSpace = false;
        this.isApartment = false;
        this.isHouse = false;
    }

    /**
     * Parametised constructor to automatically invoke variables,
     * The address class shares a has-a realtionship with this class, being invoked
     * through this construcor by references the object pointer.
     * @param windowsIn set's {@see #windows}
     * @param RoomsIn set's {@see #rooms}
     * @param KitchensIn set's {@see #Kitches}
     * @param BathroomsIn set's {@see #Bathrooms}
     * @param hasGardenIn set's {@see #hasGarden}
     * @param hasBalconyIn set's {@see #hasBalcony}.
     * @param hasParkingSpaceIn set's {@see #hasParkingSpace}.
     * @param isApartmentIn set's {@see #isApartment}
     * @param isHouseIn set's {@see #isHouse}
     * @param addressDetail set's {@see #Address}
     */
    public building(int windowsIn, int RoomsIn, int KitchensIn, int BathroomsIn, boolean hasGardenIn,
                    boolean hasBalconyIn, boolean hasParkingSpaceIn, boolean isApartmentIn, boolean isHouseIn, address addressDetail) {
        this.windows = windowsIn;
        this.rooms = RoomsIn;
        this.Kitchens = KitchensIn;
        this.Bathrooms = BathroomsIn;
        this.hasGarden = hasGardenIn;
        this.hasBalcony = hasBalconyIn;
        this.hasParkingSpace = hasParkingSpaceIn;
        setIsApartment(isApartmentIn);
        setIsHouse(isHouseIn);
        this.Address = addressDetail;
    }

    /**
     * Get {@see #windows}. @return {@link #windows}.
     */
    public int getWindows() {
        return windows;
    }

    /**
     * Set {@see #windows}. @param {@link #windowsIn}.
     */
    public void setWindows(int windowsIn) {
        this.windows = windowsIn;
    }

    /**
     * Get {@see #rooms}. @return {@link #rooms}.
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Set {@see #rooms}. @param {@link #roomsIn}.
     */
    public void setRooms(int roomsIn) {
        this.rooms = roomsIn;
    }

    /**
     * Get {@see #Kitchens}. @return {@link #Kitchens}.
     */
    public int getKitchens() {
        return Kitchens;
    }

    /**
     * Set {@see #Kitchens}. @param {@link #KitchensIn}.
     */
    public void setKitchens(int KitchensIn) {
        this.Kitchens = KitchensIn;
    }

    /**
     * Get {@see #Bathrooms}. @return {@link #Bathrooms}.
     */
    public int getBathrooms() {
        return Bathrooms;
    }

    /**
     * Set {@see #Bathrooms}. @param {@link #BathroomsIn}.
     */
    public void setBathrooms(int BathroomsIn) {
        this.Bathrooms = BathroomsIn;
    }

    /**
     * Get {@see #hasGarden}. @return {@link #hasGarden}.
     */
    public boolean getHasGarden() {
        return hasGarden;
    }

    /**
     * Set {@see #hasGarden}. @param {@link #hasGardenIn}.
     */
    public void setHasGarden(boolean hasGardenIn) {
        this.hasGarden = hasGardenIn;
    }

    /**
     * Get {@see #hasBalcony}. @return {@link #hasBalcony}.
     */
    public boolean getHasBalcony() {
        return hasBalcony;
    }

    /**
     * Set {@see #hasBalcony}. @param {@link #hasBalconyIn}.
     */
    public void setHasBalcony(boolean hasBalconyIn) {
        this.hasBalcony = hasBalconyIn;
    }

    /**
     * Get {@see #hasParkingSpace}. @return {@link #hasParkingSpace}.
     */
    public boolean getHasParkingSpace() {
        return hasParkingSpace;
    }
    /**
     * Set {@see #hasParkingSpace}. @param {@link #hasParkingSpaceIn}.
     */
    public void setHasParkingSpace(boolean hasParkingSpaceIn) {
        this.hasParkingSpace = hasParkingSpaceIn;
    }

    /**
     * Get {@see #isApartment}. @param {@link #isApartment}.
     */
    public boolean getIsApartment() {
        return isApartment;
    }

    /**
     * Set {@see #isApartment}. @param {@link #isApartmentIn}.
     * Logic to ensure that a property cannot be an apartment and a house.
     */
    public void setIsApartment(boolean isApartmentIn) {
        if(isHouse == true && isApartmentIn == true)
        {
            System.out.println("The property cannot be a apartment and a house.");
            this.isHouse = false;
            this.isApartment = false;
        }
        else
        {
            this.isApartment = isApartmentIn;
        }
    }

    /**
     * Get {@see #isHouse}. @return {@link #isHouse}.
     */
    public boolean getIsHouse() {
        return isHouse;
    }

    /**
     * @param address
     * method to change the address variable if a misake was made in its creation.
     */
    public void setAddress(address Address)
    {
        this.Address = Address;
    }

    /**
     * return address if it was needed to be changed.
     */
    public address getAddress()
    {
        return Address;
    }

    /**
     * Set {@see #isHouse}. @return {@link #isHouseIn}.
     * Logic to ensure that a property cannot be a house and an apartment.
     */
    public void setIsHouse(boolean isHouseIn) {
        if(isApartment == true && isHouseIn == true)
        {
            System.out.println("The property cannot be a house and an apartment.");
            this.isHouse = false;
            this.isApartment = false;
        }
        else
        {
            this.isHouse = isHouseIn;
        }
    }

    /**
     * Multiply {@see #monthlyRent} by 12.
     * @return {@link #monthlyRent}.
     */
    public double calculateRent(double monthlyRent){
        return monthlyRent*12;
    }

    /**
     * public methods to output all of the attributes
     * a set of if statement that turn boolean values into printed statedments
     * combines all of the variables into human readable output
     */
    public void printAllDetails() {
        if(getIsHouse() == true)
        {
            System.out.println("The property is a house.");
        }
        else if(getIsApartment() == true)
        {
            System.out.println("The property is a apartment.");
        }

        if(getHasParkingSpace() == true){
            System.out.println("The property has a parking space.");
        }
        else if (getHasParkingSpace() == false){
            System.out.println("The property does not have parking space.");
        }

        if(getHasBalcony() == true){
            System.out.println("The property has a balcony.");
        }
        else if (getHasBalcony() == false){
            System.out.println("The property does not have a baclony.");
        }

        if(getHasGarden() == true){
            System.out.println("The property has a garden.");
        }
        else if (getHasGarden() == false){
            System.out.println("The property does not have garden.");
        }
        System.out.println("The property has : " + getBathrooms() + " bathrooms.");
        System.out.println("The property has : " + getWindows() + " windows.");
        System.out.println("The property has : " + getRooms() + " rooms.");
        System.out.println("The property has : " + getKitchens() + " kitchens.");
        System.out.println("The property has a tentant : " + Address.getHasTenant());
        if(Address.getHasTenant() == true){
            System.out.println("The property has a tentant");
        }
        else if (getHasGarden() == false){
            System.out.println("The property does not have a tentant");
        }
        System.out.println("The current tenants name : " + Address.getTenantName());
        System.out.println("The street number : " + Address.getStreetNumber());
        System.out.println("The street : " + Address.getStreet());
        System.out.println("The city : " + Address.getCity());
        System.out.println("The post code : " + Address.getPostCode());
        System.out.println("The current monthly rent of property     : " + Address.getRentCost());
        if(Address.getHasTenant() == true){
            System.out.println("The yearly rent is: " +calculateRent(Address.getRentCost()));
        }
        else if(Address.getHasTenant() == false){
            System.out.println("Their current is no tenant to average yearly rent off");
        }
    }
    // End of class
}


