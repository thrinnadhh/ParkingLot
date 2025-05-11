🚗 Parking Lot Management System
A Java-based Parking Lot system built using pure object-oriented programming (OOP) principles. The system is structured using the MVC architecture, with DTOs, ORM-like in-memory storage, and the Factory Design Pattern for extensible slot allocation strategies.

✅ Features
Vehicle entry/exit and ticket generation

Slot allocation per vehicle type (bike, car, truck, etc.)

Strategy-based parking using Factory pattern

In-memory storage using Java collections

Clear separation of concerns (Controller, Service, Model, Repository)

🧱 Architecture Overview
Model Layer: Represents domain objects (Vehicle, Ticket, Slot, Gate)

Controller Layer: Handles input and routes to services

Service Layer: Business logic for ticketing and slot assignment

DTO Layer: Clean separation for requests/responses

Repository Layer (ORM): Stores and retrieves objects using in-memory maps

Factory Pattern: Used to plug different slot assignment strategies (e.g., nearest slot first)

📂 Project Structure
css
Copy
Edit
ParkingLot/
├── controllers/
├── dtos/
├── factories/
├── models/
├── repositories/
├── services/
├── strategies/
└── Main.java
🏃‍♂️ How to Run
Open the project in any Java IDE (e.g., IntelliJ, Eclipse)

Run the Main.java file directly

Interact with the console to simulate vehicle entry and slot allocation

🧠 Design Patterns Used
Factory Pattern: Creates the correct SlotAssignmentStrategy based on context

Strategy Pattern: Different slot assignment logics (e.g., nearest slot, random slot)

DTO Pattern: Clean data transfer between UI and service layers

🛠 Requirements
Java 8 or above

No build tools required (no Maven/Gradle)

Just compile and run using your IDE or terminal:

bash
Copy
Edit
javac Main.java
java Main