public class LuxCar extends Car
{
    /**
     * A class representing a luxury car, which is a type of car that inherits from the Car class and has additional luxury amenities.
     */
    private static final double FARE_MULTIPLIER = 42; //xhange
    private static final double FUEL_EFFICIENCY = 70.0; //change
    private static final double FUEL_USAGE = 0.20; //change

    private int max_inside;

    private LuxAmenities amenities;

    /**
     * Constructs a new luxury car object with the specified car ID, current station number, current destination, and car type.
     * @param current_car_id the ID number of the car
     * @param current_station_number the current station number where the car is located
     * @param current_destination the station number where the car is headed
     * @param car_typee the type of the car
     */
    public LuxCar(int current_car_id, int current_station_number, int current_destination
                  ,int car_typee)
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
        LuxAmenities yesAmenities = new LuxAmenities(true,true,true);
        amenities = yesAmenities;
    }


    public int getMaxInside() {
        return max_inside;
    }


    public double getFareMultiplier() {
        return FARE_MULTIPLIER;
    }


    public double getFuelEfficiency() {
        return FUEL_EFFICIENCY;
    }


    public double getFuelUsage() {
        return FUEL_USAGE;
    }


    public LuxAmenities getAmenities()
    {
        return amenities;
    }


    public String toString() {
        return super.toString() + "\n" + amenities.toString();
    }
}
