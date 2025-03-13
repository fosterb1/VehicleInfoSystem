package VehicleInfoSys;
public class Motorcycle implements Vehicle, MotorVehicle {
    private String make, model, motorcycleType;
    private int year, numberOfWheels;

    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setNumberOfWheels(int wheels) { this.numberOfWheels = wheels; }
    public int getNumberOfWheels() { return numberOfWheels; }

    public void setMotorcycleType(String type) { this.motorcycleType = type; }
    public String getMotorcycleType() { return motorcycleType; }
}
