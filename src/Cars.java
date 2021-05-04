public class Cars extends Vehicle{
    private String vehicleType;

    public Cars(){}

    public Cars(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Cars(String producer, int yearOfProduction, double price, String color, String vehicleType) {
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
        return "Cars{" +
                "vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
