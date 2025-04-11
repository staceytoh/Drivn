public class NormalCar extends Car
{
    /**

     NormalCar is a subclass of Car and represents a normal car that can have either 3 or 5 passengers
     */
    private int max_inside;

    private static final double FARE_MULTIPLIER = 30;
    private static final double FUEL_EFFICIENCY = 100.0;
    private static final double FUEL_USAGE = 0.1;


    /**

     Constructs a NormalCar object with a given ID, station number, destination, and car type
     @param current_car_id the ID of the car
     @param current_station_number the number of the station the car is currently located at
     @param current_destination the destination number of the car
     @param car_typee the type of the car (either 1 or 2)
     */
    public NormalCar(int current_car_id, int current_station_number, int current_destination, int car_typee)
    {
        super(current_car_id, car_typee, current_station_number, current_destination);
        if (car_typee == 1)
        {
            max_inside = 3; //this is a normal 3 seat car
        }
        else if (car_typee == 2)
        {
            max_inside = 5; //this is a normal 5 seat car
        }
    }



    public int getMaxInside()
    {
        return max_inside;
    }


    public double getFareMultiplier()
    {
        return FARE_MULTIPLIER;
    }


    public double getFuelEfficiency()
    {
        return FUEL_EFFICIENCY;
    }


    public double getFuelUsage()
    {
        return FUEL_USAGE;
    }



}
