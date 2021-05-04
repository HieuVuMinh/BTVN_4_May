public class Motorcycles extends Vehicle{
    private String vehicleType;

    public Motorcycles(){}

    public Motorcycles(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Motorcycles(String producer, int yearOfProduction, double price, String color, String vehicleType) {
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
        return "Motorcycles{" +
                "vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
