import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Passenger extends Person {
    /**

     A Passenger class representing a person who books and takes a ride in a car.

     Inherits from the Person class.
     */
    private static int passengerIDCounter = 1000;
    private int passengerID;
    private int destinationNumber;
    private int currentLocation;
    private String timeStamp;

    private int initialLocation;

    private int car_type ;

    private boolean fullRequest;

    private static final double BUSY_HOUR_PRICE_MULTIPLIER = 10.2;
    private static final double  NOT_BUSY_HOUR_PRICE_MULTIPLIER = 8.3;

    /**

     Constructor for a Passenger object.
     @param destNo the destination number for the passenger
     @param currentStation the current station for the passenger
     @param carType the type of car the passenger requested
     */


    public Passenger(int destNo, int currentStation, int carType)
    {
        super();
        passengerID = passengerIDCounter++;
        destinationNumber = destNo;
        currentLocation = currentStation;
        car_type = carType;
        timeStamp = getInitialBookingTimeStamp();
    }

    /**

     Constructor for a Passenger object with more parameters.
     @param firstName the first name of the passenger
     @param lastName the last name of the passenger
     @param address the address of the passenger
     @param city the city of the passenger
     @param zip the zip code of the passenger
     @param cellPhoneNumber the cell phone number of the passenger
     @param id the ID number of the passenger
     @param destination the destination number of the passenger
     @param current the current station of the passenger
     @param timeStampp the timestamp of the passenger's booking
     @param fullOrNot whether the passenger made a full car request or not
     @param carType the type of car the passenger requested
     */
    public Passenger(String firstName, String lastName, String address, String city, String zip,
                     String cellPhoneNumber, int id, int destination, int current,
                     String timeStampp, boolean fullOrNot, int carType) {
        super(firstName, lastName, address, city, zip, cellPhoneNumber);
        passengerID = id;
        destinationNumber = destination;
        currentLocation = current;
        timeStamp = timeStampp;
        fullRequest = fullOrNot;
        initialLocation = current;
        car_type = carType;
    }

    /**

     Returns the total distance travelled by the passenger.
     @return the total distance travelled by the passenger
     */
    public int getTotalDistanceTravelled()
    {
        return(Math.abs(initialLocation - destinationNumber));
    }

    /**

     Checks if the passenger made a full car request.
     @return true if the passenger made a full car request, false otherwise
     */
    public boolean isFullRequest()
    {
        return fullRequest;
    }

    /**

     Returns the passenger's ID number.
     @return the passenger's ID number
     */
    public int getPassengerId() {
        return passengerID;
    }

    /**

     Sets the passenger's ID number.
     @param passengerId the new passenger ID number
     */
    public void setPassengerId(int passengerId)
    {
        this.passengerID = passengerId;
    }

    /**

     Returns the passenger's destination number.
     @return the passenger's destination number
     */

    public int getDestinationNumber()
    {
        return destinationNumber;
    }

    /**
     * Sets the destination number for the passenger.
     *
     * @param destination the destination number to set
     */

    public void setDestinationNumber(int destination)
    {
       destinationNumber = destination;
    }

    /**
     * Returns the current location of the passenger.
     *
     * @return the current location of the passenger
     */

    public int getCurrentLocation()
    {
        return currentLocation;
    }

    /**
     * Sets the current location of the passenger.
     *
     * @param locationNow the current location to set
     */

    public void setCurrentLocation(int locationNow)
    {
      currentLocation = locationNow;
    }


    /**
     * Returns the timestamp of the passenger's booking.
     *
     * @return the timestamp of the passenger's booking
     */
    public String getTimeStamp()
    {
        return timeStamp;
    }
    /**
     * Sets the timestamp of the passenger's booking.
     *
     * @param time the timestamp to set
     */
    public void setTimeStamp(String time)
    {
        this.timeStamp = time;
    }

    /**
     * Returns a string representation of the passenger object.
     *
     * @return a string representation of the passenger object
     */
    public String toString()
    {
        return ("ID: " + passengerID + "-destination: " + destinationNumber);
    }


    /**
     * Returns the initial booking timestamp for the passenger.
     *
     * @return the initial booking timestamp for the passenger
     */
    public String getInitialBookingTimeStamp()  //might have to fix
    {
        Date currentDate = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(currentDate);
    }

    /**
     * Returns the car type of the passenger.
     *
     * @return the car type of the passenger
     */
    public int getCarType()
    {
        return car_type;
    }



    /**
     * Determines whether or not the current time is during a busy hour.
     * Busy hours are from 7am to 9am and from 5pm to 7pm.
     *
     * @return true if the current time is during a busy hour, false otherwise
     */

    public boolean isBusyHour()
    {
        // busy hours are from 7am to 9am and from 5pm to 7pm
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        return (hour >= 7 && hour <= 9) || (hour >= 17 && hour <= 19);
    }

    /**
     * Calculates and returns the cost of the passenger's trip based on the distance travelled
     * and whether or not the trip was taken during a busy hour.
     *
     * @return the cost of the passenger's trip
     */

    public double getCost()
    {
        int totalDistance = getTotalDistanceTravelled();
        if(isBusyHour())
        {
            return(totalDistance * BUSY_HOUR_PRICE_MULTIPLIER);
        }
        else
        {
            return(totalDistance * NOT_BUSY_HOUR_PRICE_MULTIPLIER);
        }
    }




}
