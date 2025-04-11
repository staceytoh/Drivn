/**

 The LuxAmenities class represents the luxury amenities available in a car.

 These include cold drinks, snacks, and WiFi.
 */
public class LuxAmenities
{
    private boolean coldDrinks;
    private boolean snacks;
    private boolean WiFi;

    /**

     Constructs a new LuxAmenities object with the specified amenities.
     @param drinks a boolean indicating whether cold drinks are available
     @param snacks a boolean indicating whether snacks are available
     @param wifi a boolean indicating whether WiFi is available
     */
    public LuxAmenities(boolean drinks, boolean snacks, boolean wifi)
    {
        coldDrinks = drinks;
        this.snacks = snacks;
        WiFi = wifi;
    }

    /**

     Returns a boolean indicating whether cold drinks are available.
     @return a boolean indicating whether cold drinks are available
     */
    public boolean hasColdDrinks()
    {
        return coldDrinks;
    }

    /**

     Returns a boolean indicating whether snacks are available.
     @return a boolean indicating whether snacks are available
     */
    public boolean hasSnacks() {
        return snacks;
    }

    /**

     Returns a boolean indicating whether WiFi is available.
     @return a boolean indicating whether WiFi is available
     */
    public boolean hasWiFi() {
        return WiFi;
    }


    /**

     Returns a string representation of the luxury amenities.

     @return a string representation of the luxury amenities
     */
    public String toString()
    {
        String temp = "";
        if(hasColdDrinks())
        {
            temp += " Cold drinks ";
        }

        if(hasSnacks())
        {
            temp += " Snacks ";
        }

        if(hasWiFi())
        {
            temp +=  " Wi-fi ";
        }
        return ( "Luxury Amenities: " + temp);

    }
}
