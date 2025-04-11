# 🚗 Drivn – A Ride-Sharing Fleet Simulation Engine

**Drivn** is a Java-based simulation engine that models the inner workings of a ride-sharing platform. Designed for scalability and modularity, it simulates dynamic vehicle dispatching, passenger routing, station-based travel, and real-time fleet analytics.

> **Drivn** blends object-oriented design with real-world ride-share logic to deliver a structured yet flexible simulation experience.

---

### ✨ Key Features

- 🚘 **Normal & Luxury Vehicle Classes**  
  Different capacities, amenities, and fare structures for each car type.

- 🧍 **Intelligent Passenger Matching**  
  Passengers board vehicles based on car type compatibility and route feasibility.

- 🏙️ **Station-Based World Model**  
  Simulates travel across a network of stations, with each vehicle making one stop per simulation tick.

- 📊 **Live Fleet Metrics**  
  Tracks revenue, miles driven, fuel usage, and operational status of each vehicle.

- ⛽ **Fuel and Full-Package Logic**  
  Vehicles stop running when fuel runs out. Premium passengers can request non-stop travel to their destination.

---

### 🗂️ Project Structure

```
src/
├── Main.java             # Entry point (placeholder)
├── Simulation.java       # Simulation controller
├── SimulationTester.java # Testbed for running predefined scenarios
├── Car.java              # Abstract base class for vehicles
├── NormalCar.java        # Standard service vehicle
├── LuxCar.java           # Premium service vehicle
├── LuxAmenities.java     # Tracks luxury features (Wi-Fi, snacks, etc.)
├── Person.java           # General human class
├── Passenger.java        # Ride-seeking passengers
└── Station.java          # Pick-up/drop-off locations
```

---

### 🧪 Testing Plan

Each module was tested independently and within the full simulation via `SimulationTester`.

#### ✅ Station
- Populates with a randomized passenger list.
- Removes passengers properly after successful boarding.

#### ✅ Passenger
- Accepts only compatible vehicles.
- Accurately logs miles and updates simulation revenue upon drop-off.

#### ✅ Car
- Respects type-based capacity and behavior.
- Drops off passengers at correct stations.
- Obeys fuel limits and full-package (non-stop) logic.

#### ✅ Simulation
- Randomly generates vehicles, passengers, and stations.
- Orchestrates each tick: drive, board, drop-off, and update metrics.

---

### ⚠️ Critical Verification Points

- Correct object creation and initialization
- Valid car-passenger matching
- Station-by-station movement and drop logic
- Accurate fuel usage, revenue tracking, and profit computation

---

### ▶️ Running Drivn

#### CLI Instructions

1. Place all `.java` files into a single directory.

2. Compile:
```bash
javac Person.java Passenger.java Car.java LuxAmenities.java NormalCar.java LuxCar.java Station.java Simulation.java SimulationTester.java
```

3. Run the test simulation:
```bash
java SimulationTester
```

#### IDE Option

Open the project folder in IntelliJ, Eclipse, or your preferred Java IDE.  
Run `SimulationTester.java` directly.

---

### 🔁 Simulation Cycle

Each simulation step performs:
- Driving each car to the next station
- Loading compatible passengers
- Dropping off passengers at destinations
- Updating fleet-wide revenue, miles, and fuel data

---

### 🚀 Future Enhancements

- GUI visualization of cars, stations, and routes
- Real-time ride requests with wait-time modeling
- Smart dispatch algorithms based on load balancing
- Driver/passenger satisfaction scores and ride history

---

### 👩‍💻 Developed By

**Stacey Toh**  
---

Enjoy the ride.  
Feel free to fork, improve, and adapt **Drivn** for your own simulation needs!
