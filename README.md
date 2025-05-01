# 🚗 Parking Lot Management System

## 🧩 Problem Statement
Design and implement a Parking Lot Management System capable of efficiently managing vehicle entry and exit, allocating parking slots based on vehicle type and availability. The system should be scalable, maintainable, and follow clean software design principles.

## 🛠️ Project Architecture
This project follows the **Model-View-Controller (MVC)** architecture to separate concerns:
- **Model**: Defines core business objects like `Ticket`, `Vehicle`, `Slot`, etc.
- **View**: (Placeholder layer; can be integrated with CLI, web, or mobile interfaces)
- **Controller**: Acts as a mediator between the view and model layers, processing requests and returning responses.

## 🧱 Slot Allocation Strategy
To handle different vehicle types and dynamic allocation logic, the **Factory Design Pattern** is used. A `SlotFactory` is responsible for creating appropriate slot allocators (e.g., `TwoWheelerSlotAllocator`, `FourWheelerSlotAllocator`) based on vehicle type.

## 💡 Features
- Allocates parking slots dynamically based on vehicle type.
- Generates and manages tickets upon vehicle entry and exit.
- Uses clean separation of logic to enhance maintainability and testability.
- Built with extensibility in mind: easily add new vehicle types or slot allocation strategies.

---

> 📌 **Note**: This is a backend-focused implementation. Frontend or database integration can be plugged in as needed.

