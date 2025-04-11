import java.util.ArrayList;

public class Station
{
    private int stationNumber;
    private ArrayList<Passenger> riders = new ArrayList<Passenger>();



    Station(int number)
    {
        stationNumber = number;
    }

    Station(int number , ArrayList<Passenger> passengers)
    {
        stationNumber = number;
        riders = passengers;
    }

    public int getStationNumber()
    {
        return stationNumber;
    }

    public ArrayList<Passenger> getArray()
    {
        return riders;
    }

    public void addPassenger(Passenger toBeAdded)
    {
        riders.add(toBeAdded);
    }

    public boolean hasPeopleWaiting()
    {
        if(riders.size() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Passenger getPassenger(int index)
    {
        return(riders.get(index));
    }

    public int getNumberOfWaiting()
    {

        return(riders.size());
    }

    public String toString()
    {
        return riders.toString();
    }
    Passenger removeAt(int index)
    {
        return(riders.remove(index));
    }



}
