# 🚗 Parking Lot Management System

A Java-based Parking Lot system built using **pure object-oriented programming** (OOP). The application follows the **MVC architecture**, uses **DTOs**, simulates ORM behavior with in-memory repositories, and applies the **Factory Design Pattern** for dynamic slot allocation strategies.

---

## 📌 Features

- Entry/exit of vehicles with ticket generation
- Vehicle type–based slot allocation
- Strategy-driven parking logic (via Factory pattern)
- In-memory storage using Java collections (no database)
- DTOs for data exchange between layers

---

## 🏗️ Architecture

ParkingLot/
├── controllers/
├── dtos/
├── factories/
├── models/
├── repositories/
├── services/
├── strategies/
└── Main.java


- **Model**: Vehicle, Ticket, Slot, Gate, etc.  
- **Controller**: Entry point handlers  
- **Service**: Business logic (e.g. `TicketService`)  
- **DTOs**: Input/output abstraction  
- **Repositories**: In-memory ORM (Java Maps)  
- **Factories/Strategies**: For dynamic slot assignment logic

---

## 🧠 Design Patterns Used

- **Factory Pattern** – to produce slot assignment strategies  
- **Strategy Pattern** – to apply different parking logics  
- **DTO Pattern** – to cleanly transfer request/response data

---

## 🛠️ How to Run

> This project is implemented with **no frameworks**, **no Maven**, and **no external libraries**.

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ParkingLot.git
   cd ParkingLot/src
2.Compile and Run
```bash
  javac Main.java
  java Main
