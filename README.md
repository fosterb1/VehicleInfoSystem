
# 🚗 Vehicle Information System 🚛

## 📌 Overview
The **Vehicle Information System** is a Java-based console application that allows users to manage and retrieve information about different types of vehicles, including **cars, motorcycles, and trucks**. Designed with **object-oriented programming (OOP)** principles, it demonstrates **inheritance, interfaces, and encapsulation** to create a flexible vehicle management system.



## ✨ Features
✔️ **Choose a vehicle type**: Car, Motorcycle, or Truck  
✔️ **Retrieve vehicle details**:  
   - 🚗 **Car**: Number of doors, fuel type  
   - 🏍️ **Motorcycle**: Number of wheels, motorcycle type  
   - 🚛 **Truck**: Cargo capacity, transmission type  
✔️ **Uses Object-Oriented Principles**: Interfaces & Inheritance  
✔️ **User-friendly console interface**  



## 📂 Project Structure

VehicleInfoSystem/
│── src/
│   ├── VehicleInfoSys/
│   │   ├── Vehicle.java            # Interface defining vehicle attributes
│   │   ├── Car.java                # Car class implementing Vehicle
│   │   ├── Motorcycle.java         # Motorcycle class implementing Vehicle
│   │   ├── Truck.java              # Truck class implementing Vehicle
│   │   ├── VehicleInfoSystem.java  # Main program logic
│   │   ├── CarVehicle.java         # Extended car properties
│   │   ├── TruckVehicle.java       # Extended truck properties
│   │   ├── MotorVehicle.java       # Parent class for motorized vehicles
│── README.md                       # Project documentation
│── .gitignore                       # Git ignore file for Java projects
│── pom.xml (if using Maven)         # Dependency management




## 🚀 Getting Started

### 📌 Prerequisites
- Java **JDK 8 or later**  
- Any **Java IDE** (IntelliJ, Eclipse, VS Code) or a command-line terminal  

### 🔧 Installation & Execution

1️⃣ **Clone the Repository**  

git clone https://github.com/your-username/VehicleInfoSystem.git
cd VehicleInfoSystem


2️⃣ **Compile the Java Files**  

javac -d bin src/VehicleInfoSys/*.java


3️⃣ **Run the Application**  

java -cp bin VehicleInfoSys.VehicleInfoSystem


4️⃣ **Follow the Prompts**  

Choose a vehicle type: Car, Motorcycle, or Truck
> car

Car Details:
Make: Toyota
Model: Camry
Year: 2020
Doors: 4
Fuel: Petrol




## 🛠️ Technologies Used
- **Java** (Object-Oriented Programming)  
- **Interfaces and Inheritance**  
- **Scanner for User Input**  
- **Encapsulation for Data Management**  



## 🎯 Future Enhancements
🔹 **Database Integration** – Store vehicle data in a database  
🔹 **GUI Version** – Implement a graphical user interface using JavaFX  
🔹 **Electric Vehicles Support** – Add properties for EVs  



### 📧 Contact
**Developer:** *FOSTER BOADI*  
📩 Email: *fosterboadi152@gmail.com*  
🔗 GitHub: *https://github.com/fosterb1* 
   LinkedIn:*https://www.linkedin.com/in/fosterboadi/*


