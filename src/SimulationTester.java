import java.util.Random;
public class SimulationTester
{
    public static void main(String[] args)
    {
        Random generator = new Random();

        Simulation simulation = new Simulation(generator);

        simulation.loadRandomScenario(5);

        simulation.driveAllCars();

        System.out.printf("Total Fares Collected: $%.2f \n", simulation.get_fares());
        System.out.println("Total Miles Driven: " + simulation.get_miles_driven());
    }
}


/*
SAMPLE RUN
NUMBER OF LUXURIOUS CARS: 19
Car details: Car ID: 1001
Current Station Number: 1
Destination: 5
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1002
Current Station Number: 1
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 1
Destination: 6
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1004
Current Station Number: 1
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1005
Current Station Number: 1
Destination: 3
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1006
Current Station Number: 1
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1002
Current Station Number: 2
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 2
Destination: 2
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1003has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 0

Car details: Car ID: 1001
Current Station Number: 3
Destination: 2
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1001has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 1

Car details: Car ID: 1006
Current Station Number: 3
Destination: 3
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1006has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 0

Car details: Car ID: 1004
Current Station Number: 4
Destination: 3
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1004has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 1

Car details: Car ID: 1001
Current Station Number: 5
Destination: 2
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1002
Current Station Number: 5
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1002has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 1

Car details: Car ID: 1005
Current Station Number: 5
Destination: 2
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1001
Current Station Number: 2
Destination: 5
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1002
Current Station Number: 2
Destination: 4
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 2
Destination: 6
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1004
Current Station Number: 2
Destination: 4
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1005
Current Station Number: 2
Destination: 3
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1005has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 2

Car details: Car ID: 1002
Current Station Number: 3
Destination: 4
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1002has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 2

Car details: Car ID: 1003
Current Station Number: 3
Destination: 5
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1007
Current Station Number: 3
Destination: 3
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1007has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 0

Car details: Car ID: 1001
Current Station Number: 4
Destination: 2
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 5
Destination: 2
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1005
Current Station Number: 4
Destination: 2
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1001
Current Station Number: 3
Destination: 5
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1002
Current Station Number: 3
Destination: 4
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1002has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 3

Car details: Car ID: 1004
Current Station Number: 3
Destination: 4
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1004has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 3

Car details: Car ID: 1004
Current Station Number: 2
Destination: 6
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 4
Destination: 5
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1003has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 2

Car details: Car ID: 1001
Current Station Number: 3
Destination: 2
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1001has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 3

Car details: Car ID: 1005
Current Station Number: 3
Destination: 2
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1005has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 3

Car details: Car ID: 1001
Current Station Number: 4
Destination: 5
Passengers: []
Miles Driven: 3
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1001has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 4

Car details: Car ID: 1006
Current Station Number: 2
Destination: 4
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1004
Current Station Number: 3
Destination: 6
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1006
Current Station Number: 4
Destination: 6
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 4
Destination: 2
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 3
Destination: 6
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1006
Current Station Number: 3
Destination: 4
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1006has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 3

Car details: Car ID: 1006
Current Station Number: 5
Destination: 6
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1006has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 2

Car details: Car ID: 1003
Current Station Number: 4
Destination: 6
Passengers: []
Miles Driven: 3
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1004
Current Station Number: 4
Destination: 6
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car details: Car ID: 1003
Current Station Number: 3
Destination: 2
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1003has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 3

Car details: Car ID: 1003
Current Station Number: 5
Destination: 6
Passengers: []
Miles Driven: 4
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1003has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 5

Car details: Car ID: 1004
Current Station Number: 5
Destination: 6
Passengers: []
Miles Driven: 3
Fares Collected: 0.0

Luxury Amenities:  Cold drinks  Snacks  Wi-fi
Car 1004has arrived at the destination.
Revenue collected: 0.0
Total Miles of car driven: 4

NUMBER OF NORMAL CARS: 12
Car details: Car ID: 1001
Current Station Number: 3
Destination: 6
Passengers: [ID: 1039-destination: 3, ID: 1037-destination: 5, ID: 1034-destination: 4]
Miles Driven: 1
Fares Collected: 0.0

Passenger 1039 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car details: Car ID: 1005
Current Station Number: 3
Destination: 5
Passengers: [ID: 1021-destination: 4]
Miles Driven: 1
Fares Collected: 0.0

Car details: Car ID: 1006
Current Station Number: 2
Destination: 2
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Car 1006 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 0

Car details: Car ID: 1002
Current Station Number: 2
Destination: 2
Passengers: [ID: 1058-destination: 1]
Miles Driven: 1
Fares Collected: 0.0

Car 1002 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 1

Car details: Car ID: 1005
Current Station Number: 4
Destination: 6
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Car details: Car ID: 1001
Current Station Number: 3
Destination: 3
Passengers: [ID: 1068-destination: 2, ID: 1064-destination: 2]
Miles Driven: 1
Fares Collected: 0.0

Car 1001 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 1

Car details: Car ID: 1003
Current Station Number: 4
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Car 1003 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 0

Car details: Car ID: 1004
Current Station Number: 4
Destination: 3
Passengers: [ID: 1097-destination: 3, ID: 1088-destination: 3, ID: 1084-destination: 2]
Miles Driven: 1
Fares Collected: 0.0

Car details: Car ID: 1001
Current Station Number: 4
Destination: 6
Passengers: [ID: 1037-destination: 5, ID: 1034-destination: 4]
Miles Driven: 2
Fares Collected: 24.900000000000002

Passenger 1034 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car details: Car ID: 1005
Current Station Number: 4
Destination: 5
Passengers: [ID: 1021-destination: 4]
Miles Driven: 2
Fares Collected: 0.0

Passenger 1021 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car details: Car ID: 1007
Current Station Number: 3
Destination: 4
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Car details: Car ID: 1004
Current Station Number: 4
Destination: 6
Passengers: [ID: 1060-destination: 5, ID: 1042-destination: 5]
Miles Driven: 1
Fares Collected: 0.0

Car details: Car ID: 1005
Current Station Number: 5
Destination: 6
Passengers: [ID: 1065-destination: 5]
Miles Driven: 2
Fares Collected: 0.0

Passenger 1065 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car details: Car ID: 1002
Current Station Number: 3
Destination: 3
Passengers: []
Miles Driven: 1
Fares Collected: 0.0

Car 1002 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 1

Car details: Car ID: 1004
Current Station Number: 3
Destination: 3
Passengers: [ID: 1097-destination: 3, ID: 1088-destination: 3, ID: 1084-destination: 2]
Miles Driven: 2
Fares Collected: 0.0

Passenger 1097 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Passenger 1088 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car 1004 has arrived at the destination.
Revenue collected: $49.800000000000004
Total Miles of car driven: 2

Car details: Car ID: 1001
Current Station Number: 5
Destination: 6
Passengers: [ID: 1037-destination: 5]
Miles Driven: 3
Fares Collected: 58.10000000000001

Passenger 1037 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car details: Car ID: 1005
Current Station Number: 5
Destination: 5
Passengers: []
Miles Driven: 3
Fares Collected: 33.2

Car 1005 has arrived at the destination.
Revenue collected: $33.2
Total Miles of car driven: 3

Car details: Car ID: 1004
Current Station Number: 5
Destination: 6
Passengers: [ID: 1060-destination: 5, ID: 1042-destination: 5]
Miles Driven: 2
Fares Collected: 0.0

Passenger 1060 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Passenger 1042 has reached,  initial booking time: 2023-05-02 23:18:54, Drop off time: 2023-05-02 23:18:54
Car details: Car ID: 1005
Current Station Number: 6
Destination: 6
Passengers: []
Miles Driven: 3
Fares Collected: 41.5

Car 1005 has arrived at the destination.
Revenue collected: $41.5
Total Miles of car driven: 3

Car details: Car ID: 1001
Current Station Number: 6
Destination: 6
Passengers: []
Miles Driven: 4
Fares Collected: 99.60000000000001

Car 1001 has arrived at the destination.
Revenue collected: $99.60000000000001
Total Miles of car driven: 4

Car details: Car ID: 1004
Current Station Number: 6
Destination: 6
Passengers: []
Miles Driven: 3
Fares Collected: 83.0

Car 1004 has arrived at the destination.
Revenue collected: $83.0
Total Miles of car driven: 3

Car details: Car ID: 1007
Current Station Number: 4
Destination: 4
Passengers: []
Miles Driven: 2
Fares Collected: 0.0

Car 1007 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 2

Car details: Car ID: 1005
Current Station Number: 4
Destination: 4
Passengers: []
Miles Driven: 0
Fares Collected: 0.0

Car 1005 has arrived at the destination.
Revenue collected: $0.0
Total Miles of car driven: 0

Total Fares Collected: $305.70
Total Miles Driven: 62
 */