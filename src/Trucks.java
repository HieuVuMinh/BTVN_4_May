public class Trucks extends Vehicle{
    private String vehicleType;

    public Trucks(){}

    public Trucks(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Trucks(String producer, int yearOfProduction, double price, String color, String vehicleType) {
        super(producer, yearOfProduction, price, color);
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
