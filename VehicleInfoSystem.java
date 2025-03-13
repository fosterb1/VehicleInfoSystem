package VehicleInfoSys;
import java.util.Scanner;

public class VehicleInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle type: Car, Motorcycle, or Truck");
        String vehicleType = scanner.nextLine();

        switch (vehicleType.toLowerCase()) {
            case "car":
            Car car = new Car("Toyota", "Camry", 2020);
                car.setNumberOfDoors(4);
                car.setFuelType("Petrol");
                System.out.println("Car Details:");
                System.out.println("Make: " + car.getMake());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Doors: " + car.getNumberOfDoors());
                System.out.println("Fuel: " + car.getFuelType());
                break;

            case "motorcycle":
                Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2021);
                motorcycle.setNumberOfWheels(2);
                motorcycle.setMotorcycleType("Sport");
                System.out.println("Motorcycle Details:");
                System.out.println("Make: " + motorcycle.getMake());
                System.out.println("Model: " + motorcycle.getModel());
                System.out.println("Year: " + motorcycle.getYear());
                System.out.println("Wheels: " + motorcycle.getNumberOfWheels());
                System.out.println("Type: " + motorcycle.getMotorcycleType());
                break;

            case "truck":
                Truck truck = new Truck("Volvo", "FH16", 2019);
                truck.setCargoCapacity(18.0);
                truck.setTransmissionType("Manual");
                System.out.println("Truck Details:");
                System.out.println("Make: " + truck.getMake());
                System.out.println("Model: " + truck.getModel());
                System.out.println("Year: " + truck.getYear());
                System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
                System.out.println("Transmission: " + truck.getTransmissionType());
                break;

            default:
                System.out.println("Invalid vehicle type.");
        }

        scanner.close();
    }
}
