import java.util.Random;
import java.util.ArrayList;



/**
 * As long as you still have room for passengers load
 * any passengers waiting in the station, provided
 * you can drop off the passenger at, or before your destination
 * Drive all the cars in the cars ArrayList.
 * When a car reaches its destination,
 * - retrieve the miles driven and the amount earned
 * - remove it from the array list
 * Only drive each car one station at a time.
 * Make sure you remember to drop off passengers at
 * their stations along with way
 */
public class Simulation
{
    private Random generator;
    private ArrayList<NormalCar> normalCarArrayList = new ArrayList<>();
    private ArrayList<LuxCar> luxCarArrayList = new ArrayList<>();
    private Station[] stations;
    private double revenue_collected = 0.0;
    private int total_miles_driven = 0;
    private boolean normal_list_is_empty(){return normalCarArrayList.size() == 0;}

    private boolean luxury_list_is_empty(){return luxCarArrayList.size() == 0;}

    /**
     * Construct a simulation using a given generator.
     * @param generator the Random generator to use in this simulation.
     */
    public Simulation(Random generator)
    {
        this.generator = generator;
    }

    /**

     Adds a NormalCar object to the list of normal cars in this simulation.
     @param car the NormalCar object to be added.
     */
    public void add_car(NormalCar car) { normalCarArrayList.add(car); }

    /**

     Adds a LuxCar object to the list of luxury cars in this simulation.
     @param car the LuxCar object to be added.
     */
    public void add_car(LuxCar car) { luxCarArrayList.add(car); }

    /**

     Gets the total revenue collected in this simulation.
     @return the total revenue collected.
     */
    public double get_fares() { return revenue_collected; }

    /**

     Gets the total miles driven in this simulation.
     @return the total miles driven.
     */
    public int get_miles_driven() { return total_miles_driven; }

    /**
     * Pick up passengers from a station.
     * @station the station to load passengers from.
     * @car the car that we want to load the passengers into.
     */
    public void load_passengers(Station station, NormalCar car)
    {
        if (car.hasRoom() && station.hasPeopleWaiting())
        {
            int cDest = car.getDestination();
            for (int i = station.getNumberOfWaiting() - 1; car.hasRoom() && i >= 0; i--)
            {
                Passenger possible = station.getPassenger(i);
                int pDest = possible.getDestinationNumber();
                int stationNo = station.getStationNumber();
                if (stationNo > cDest && pDest < stationNo && pDest >= cDest ||
                        stationNo < cDest && pDest > stationNo && pDest <= cDest)
                {
                    car.add(station.removeAt(i));
                }
            }
        }
    }

    public void load_passengers(Station station, LuxCar car)
    {
        if (car.hasRoom() && station.hasPeopleWaiting())
        {
            int cDest = car.getDestination();
            for (int i = station.getNumberOfWaiting() - 1; car.hasRoom() && i >= 0; i--)
            {
                Passenger possible = station.getPassenger(i);
                int pDest = possible.getDestinationNumber();
                int stationNo = station.getStationNumber();
                if (stationNo > cDest && pDest < stationNo && pDest >= cDest ||
                        stationNo < cDest && pDest > stationNo && pDest <= cDest)
                {
                    car.add(station.removeAt(i));
                }
            }
        }
    }

    /**
     * Drive all the cars to their destination.
     */
    public void driveAllCars()
    {
        System.out.println("NUMBER OF LUXURIOUS CARS: " + luxCarArrayList.size());
        while (!luxury_list_is_empty()) {
            for (int i = 0; i < luxCarArrayList.size(); i++)
            {
                LuxCar car = luxCarArrayList.get(i);
                System.out.println("Car details: " + car.toString());

                car.drive();
                car.dropOff();

                if (car.getLocation() < stations.length) load_passengers(stations[car.getLocation()], car);

                if (car.hasArrived())
                {
                    revenue_collected += car.calculateRevenue();
                    total_miles_driven += car.getMilesDriven();
                    System.out.println("Car " + car.getCarID() + "has arrived at the destination.");
                    System.out.println("Revenue collected: " + car.getFares());
                    System.out.println("Total Miles of car driven: " + car.getMilesDriven());
                    System.out.println();
                    luxCarArrayList.remove(i);
                }
            }
        }


        System.out.println("NUMBER OF NORMAL CARS: " + normalCarArrayList.size());
        while (!normal_list_is_empty()) {
            for (int i = 0; i < normalCarArrayList.size(); i++)
            {
                NormalCar car = normalCarArrayList.get(i);
                car.drive();
                System.out.println("Car details: " + car.toString());
                car.dropOff();

                if (car.getLocation() < stations.length) load_passengers(stations[car.getLocation()], car);

                if (car.hasArrived())
                {
                    revenue_collected += car.calculateRevenue();
                    total_miles_driven += car.getMilesDriven();
                    System.out.println("Car " + car.getCarID() + " has arrived at the destination.");
                    System.out.println("Revenue collected: $" + car.getFares());
                    System.out.println("Total Miles of car driven: " + car.getMilesDriven());
                    System.out.println();
                    normalCarArrayList.remove(i);
                }
            }
        }
    }


    /**
     * Load a scenario into the simulator.
     * @param numStations - the number of stations to add.
     */
    public void loadRandomScenario(int numStations)
    {
        // Follow this plan
        // 1. Construct the array of stations and initialize variables
        // 2. Visit each station; generate a station, cars and passengers
        //    NOTE: When constructing stations, the station number will be 1
        //    greater than the array index, so stations[0].getNumber() returns 1.
        //    Follows numbering scheme that the cars and passengers expect.
        //   A. For the number of passengers to add to each station,
        //      Use 10 + a random number from 0 to the number of stations * 3
        //      Generate this number separately for each station
        //   B. Randomly select a destination station between 1 + number of stations
        //      If the destination is the same as the station number, keep trying.
        //      You can generate a random name for the passenger.
        //   C. For each station, the number of cars should be the number of
        //      passengers (for that station) / 3. Generate the destinations
        //      using the same algorithm as with the passengers.

        stations = new Station[numStations];
        for (int i = 0; i < numStations; i++)
        {

            stations[i] = new Station(i + 1);
            int number_of_customers = 10 + generator.nextInt(numStations) * 3;

            for (int r = 0; r <number_of_customers; r++)
            {

                int random_destination = generator.nextInt(numStations) + 1;
                while (random_destination == i)
                {
                    random_destination = generator.nextInt(numStations) + 1;
                }
                int random_customer_car_type = generator.nextInt(4)+ 1;
                Passenger customer = new Passenger(random_destination, i, random_customer_car_type);
                stations[i].addPassenger(customer);
            }

            int random_number_of_cars = number_of_customers / 3;
            int carID = 1000;
            for (int c = 0; c < random_number_of_cars; c++)
            {

                carID ++;
                int random_dest_no = generator.nextInt(numStations) + 1;
                while (random_dest_no == i + 1)
                {
                    random_dest_no= generator.nextInt(numStations) + 1;

                }

                int random_car_type = generator.nextInt(4)+ 1;

                if(random_car_type == 1 || random_car_type == 2)
                {
                    NormalCar newCar = new NormalCar(carID, i, random_dest_no, random_car_type);

                    load_passengers(stations[i], newCar);
                    this.add_car(newCar);

                }
                else if(random_car_type == 3 || random_car_type == 4)
                {
                    LuxCar newCar = new LuxCar(carID, i, random_dest_no, random_car_type);

                    load_passengers(stations[i], newCar);
                    this.add_car(newCar);

                }

            }


        }
    }

}