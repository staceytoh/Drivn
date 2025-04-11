import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


public abstract class Car
{

    /**

     This is an abstract class for the car objects in the simulation.
     It has common properties and methods that all cars share.
     */
    private int carID;
    private int carType;
    private int destination;
    private int currentLocation;
    private ArrayList<Passenger> passengersInside;
    private double faresCollected;
    private int milesDriven;
    private double fuelLevel;

    final double FUEL_COST_PER_GALLON = 1.75; // dollars per gallon


    /**
     * Construct a new Car object with initial values for properties.
     * @param current_car_id the ID of the car.
     * @param current_car_type the type of the car.
     * @param current_station_number the number of the station where the car is initially located.
     * @param current_destination the number of the station where the car is headed to.
     */
    public Car(int current_car_id, int current_car_type, int current_station_number, int current_destination)
    {
        carID = current_car_id;
        carType = current_car_type;
        currentLocation = current_station_number;
        destination = current_destination;
        passengersInside = new ArrayList<Passenger>();
        faresCollected = 0.0;
        milesDriven = 0;
        fuelLevel = 16; // full tank as prompted by professor
    }

    /**
     * Return the ID of the car.
     * @return the ID of the car.
     */
    public int getCarID()
    {
        return carID;
    }

    /**
     * Return the type of the car.
     * @return the type of the car.
     */
    public int getCarType()
    {
        return(carType);
    }


    /**
     * Return the station number where the car is located.
     * @return the station number of where the car is located.
     */
    public int getLocation()
    {
        return currentLocation;
    }

    /**
     * Return the destination number where the car is located.
     * @return the destination number of where the car is located.
     */
    public int getDestination()
    {
        return destination;
    }

    /**
     * Check if the car has arrived at its destination.
     * @return true if the car has arrived, false otherwise.
     */
    public boolean hasArrived()
    {
//        System.out.println(currentLocation + "\t" + destination);
        return (currentLocation == destination);
    }

    /**
     * Check if the car has room for passengers.
     * @return true if the car has room, false otherwise.
     */
    public boolean hasRoom()
    {
        return (passengersInside.size() < getMaxInside());
    }

    /**
     * Return the total fares collected by the car.
     * @return the total fares collected by the car.
     */
    public double getFares()
    {
        return faresCollected;
    }

    /**
     * Return the total miles driven by the car.
     * @return the total miles driven by the car.
     */
    public int getMilesDriven()
    {
        return milesDriven;
    }

    /**
     * Drive the car one station closer to its destination.
     */
    public void drive()
    {
        if (currentLocation != destination && canStillRun())
        {
            milesDriven++;
            fuelLevel -= getFuelUsage();
            currentLocation = (currentLocation > destination) ? (currentLocation - 1) : (currentLocation + 1);
        }
        if(!canStillRun())
        {
            System.out.println("Car ran out of fuel");
        }
    }

    /**
     * Drops off passengers at their destination and updates the fares collected for the car.
     * Prints out the passenger ID, initial booking time, and drop off time for each passenger.
     */
    public void dropOff()
    {
        for (int i = 0; i < passengersInside.size(); i++)
        {
            if (passengersInside.get(i).getDestinationNumber()  - 1 == (currentLocation))
            {
                faresCollected += passengersInside.get(i).getCost();

                System.out.print("Passenger " + passengersInside.get(i).getPassengerId() +
                        " has reached,  initial booking time: " +
                        passengersInside.get(i).getInitialBookingTimeStamp());
                System.out.print(", Drop off time: " + getTimeStamp());
                System.out.println();

                passengersInside.remove(i);
                i--;
            }
        }
    }

    /**
     * Adds a passenger to the car if there is room and the passenger's car type matches the car's car type.
     * @param p the passenger to add
     * @return true if the passenger is successfully added, false otherwise
     */
    public boolean add(Passenger p)
    {
        if (hasRoom() && p.getCarType() == getCarType())
        {
            passengersInside.add(p);
            return true;
        } else
        {
            return false;
        }
    }

    /**
     * Calculates the fuel cost for the car based on the miles driven and fuel efficiency.
     * @return the fuel cost
     */
    public double calculateFuelCost()
    {
        return milesDriven / getFuelEfficiency() * FUEL_COST_PER_GALLON;
    }

    /**
     * Returns a string representation of the car, including the car ID, current station number, destination,
     * passengers inside, miles driven, and fares collected.
     * @return the string representation of the car
     */
    public String toString()
    {
        return "Car ID: " + carID + "\nCurrent Station Number: " + (currentLocation + 1) + "\nDestination: "
                + (destination + 1) + "\nPassengers: " + passengersInside.toString() + "\nMiles Driven: " + milesDriven +
                "\nFares Collected: " + faresCollected + "\n";
    }

    /**
     * Returns the maximum distance the car can travel based on its car type.
     * @return the maximum distance the car can travel
     */
    public double getMaxDistance()
    {
        if(getCarType() == 1 || getCarType() == 3)
        {
            return (400);
        }
        else
        {
            return (350);
        }
    }

    /**
     * Returns whether the car can still run, based on its fuel level and miles driven.
     * @return true if the car can still run, false otherwise
     */
    public boolean canStillRun()
    {
        if (fuelLevel > 0 && milesDriven < getMaxDistance())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Calculates the revenue collected by the car, based on the fares collected and fuel spending.
     * @return the revenue collected
     */

    public double calculateRevenue()
    {
        double fuelSpending = calculateFuelCost();
        return (faresCollected - fuelSpending);
    }


    /**
     * Returns the current time stamp in the format of "yyyy-MM-dd HH:mm:ss".
     * @return the current time stamp
     */

    public String getTimeStamp()
    {
        Date currentDate = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(currentDate);
    }



    /**
     * Returns the maximum number of passengers the car can hold.
     * @return the maximum number of passengers the car can hold
     */
    public abstract int getMaxInside();

    /**
     * Returns the fare multiplier for the car.
     * @return the fare multiplier for the car
     */
    public abstract double getFareMultiplier();

    /**
     * Returns the fuel efficiency of the car.
     * @return the fuel efficiency of the car
     */
    public abstract double getFuelEfficiency();

    /**

     This method returns the fuel usage of the car in gallons per mile
     @return a double representing the fuel usage of the car in gallons per mile
     */
    public abstract double getFuelUsage();


}
