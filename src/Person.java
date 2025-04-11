public class Person {


    /**

     A class representing a person with basic information such as first name, last name, address, city, zipcode, and phone number.
     */
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipcode;
    private String phoneNumber;

    /**

     Constructs a new Person object with empty values for first name, last name, address, city, zip code, and phone number.
     */
    public Person()
    {
        firstName = "";
        lastName = "";
        address = "";
        city = "";
        zipcode = "";
        phoneNumber = "";
    }

    /**

     Constructs a new Person object with specified values for first name, last name, address, city, zip code, and phone number.
     @param first the first name of the person
     @param last the last name of the person
     @param theAddress the address of the person
     @param theCity the city where the person resides
     @param zip the zip code of the person's city
     @param cellPhoneNumber the phone number of the person
     */
    public Person(String first, String last, String theAddress, String theCity, String zip, String cellPhoneNumber)
    {
        firstName = first;
        lastName = last;
        address = theAddress;
        city = theCity;
        zipcode = zip;
        phoneNumber = cellPhoneNumber;
    }

    /**

     Returns the first name of the person.
     @return the first name of the person
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**

     Sets the first name of the person to the specified value.
     @param first the new first name of the person
     */
    public void setFirstName(String first)
    {
       firstName = first;
    }

    /**

     Returns the last name of the person.
     @return the last name of the person
     */
    public String getLastName()
    {
        return lastName;
    }

    /**

     Sets the last name of the person to the specified value.
     @param last the new last name of the person
     */
    public void setLastName(String last)
    {
       lastName = last;
    }
    /**

     Returns the address of the person.
     @return the address of the person
     */
    public String getAddress()
    {
        return address;
    }

    /**

     Sets the address of the person to the specified value.
     @param theAddress the new address of the person
     */
    public void setAddress(String theAddress)
    {
        address = theAddress;
    }

    /**

     Returns the city where the person resides.
     @return the city where the person resides
     */
    public String getCity()
    {
        return city;
    }

    /**

     Sets the city where the person resides to the specified value.
     @param cityy the new city where the person resides
     */
    public void setCity(String cityy)
    {
        city = cityy;
    }

    /**

     Returns the zip code of the person's city.
     @return the zip code of the person's city
     */

    public String getZip()
    {
        return zipcode;
    }

    /**

     Sets the zip code of the person's city to the specified value.
     @param zip the new zip code of the person's city
     */
    public void setZip(String zip)
    {
        zipcode = zip;
    }



    /**

     Returns the phone number of the person.
     @return the phone number of the person
     */
    public String getCellPhoneNumber()
    {
        return phoneNumber;
    }


    /**

     Sets the phone number of the person.
     @param cellPhoneNumber the phone number to be set
     */
    public void setCellPhoneNumber(String cellPhoneNumber)
    {
        phoneNumber = cellPhoneNumber;
    }
}
