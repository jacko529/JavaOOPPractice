package Task1;

/**
 *
 * The class for instaniting address objects.
 * This class is a part of the HAS-A relationship of the building class.
 *
 * Contains method to calculate rent on a monthly to annual basis.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class address
{
    // variable to hold if the address has a tenant currently.
    private boolean hasTenant;
    // variable to hold the name of the current tenant.
    private String TenantName;
    // variable to hold the street number of the address.
    private String StreetNumber;
    // variable to hold the street of the address.
    private String Street;
    // variable to hold the city of the address.
    private String City;
    // variable to hold the postcode of the address.
    private String PostCode;
    // variable to hold the amount rent costs.
    private double RentCost;
    /**
     * Constructor method to set all values to null
     * set's {@see #hasTenant} to false.
     * set's {@see #TenantName} to null.
     * set's {@see #StreetNumber} to null
     * set's {@see #Street} to null.
     * set's {@see #City} to null.
     * set's {@see #PostCode} to null.
     * set's {@see #RentCost} to 0
     */
    public address() {
        this.hasTenant = false;
        this.TenantName = null;
        this.StreetNumber = null;
        this.Street = null;
        this.City = null;
        this.PostCode = null;
        this.RentCost = 0;
    }

    /**
     * @param hasTenantIn set's {@see #hasTenet}.
     * @param TenantNameIn set's {@see #TenantName}.
     * @param StreetNumberIn set's {@see #StreetNumber}.
     * @param StreetIn set's {@see #Street}.
     * @param CityIn set's {@see #City}.
     * @param PostCodeIn set's {@see #PostCode} to null.
     * @param RentCostIn - allocated to the setter to ensure positive number is inserted
     * set's {@see #RentCost}.
     */
    public address(boolean hasTenantIn, String TenantNameIn, String StreetNumberIn, String StreetIn, String CityIn, String PostCodeIn,
                   double RentCostIn)
    {
        this.hasTenant = hasTenantIn;
        this.TenantName = TenantNameIn;
        this.StreetNumber = StreetNumberIn;
        this.Street = StreetIn;
        this.City = CityIn;
        this.PostCode = PostCodeIn;
        setRentCost(RentCostIn);
    }

    /**
     * Set {@see #hasTenant}. @return {@link #hasTenant}.
     */
    public boolean getHasTenant() {
        return hasTenant;
    }

    /**
     * Set {@see #hasTenant}. @param {@link #hasTenantIn}.
     */
    public void setHasTenant(boolean hasTenantIn) {
        this.hasTenant = hasTenantIn;
    }

    /**
     * Set {@see #TenantName}. @return {@link #TenantName}.
     */
    public String getTenantName() {
        return TenantName;
    }

    /**
     * Set {@see #TenantName}. @param {@link #tenantNameIn}.
     */
    public void setTenantName(String tenantNameIn) {
        this.TenantName = tenantNameIn;
    }

    /**
     * Set {@see #StreetNumber}. @return {@link #StreetNumber}.
     */
    public String getStreetNumber() {
        return StreetNumber;
    }

    /**
     * Set {@see #fee}. @param {@link #feeIn}.
     */
    public void setStreetNumber(String streetNumberIn) {
        this.StreetNumber = streetNumberIn;
    }

    /**
     * Set {@see #Street}. @return {@link #Street}.
     */
    public String getStreet() {
        return Street;
    }

    /**
     * Set {@see #Street}. @param {@link #streetIn}.
     */
    public void setStreet(String streetIn) {
        this.Street = streetIn;
    }

    /**
     * Set {@see #City}. @return {@link #City}.
     */
    public String getCity() {
        return City;
    }

    /**
     * Set {@see #City}. @param {@link #cityIn}.
     */
    public void setCity(String cityIn) {
        this.City = cityIn;
    }

    /**
     * Set {@see #PostCode}. @return {@link #PostCode}.
     */
    public String getPostCode() {
        return PostCode;
    }

    /**
     * Set {@see #PostCode}. @param {@link #postCodeIn}.
     */
    public void setPostCode(String postCodeIn) {
        this.PostCode = postCodeIn;
    }

    /**
     * Set {@see #RentCost}. @return {@link #RentCost}.
     */
    public double getRentCost() {
        return RentCost;
    }

    /**
     * Set {@see #RentCost}. @param {@link #rentCostIn}.
     * Logic to ensure that the amount set for rent is a positive number.
     */
    public void setRentCost(double rentCostIn) {
        if(rentCostIn < 0)
        {
            System.out.println("The rent amount must be a positive number.");
        }
        else
        {
            this.RentCost = rentCostIn;
        }
    }
}

