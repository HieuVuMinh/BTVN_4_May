public class PersonalMotorcycles extends Motorcycles{
    private double horsePower;

    public PersonalMotorcycles(){}

    public PersonalMotorcycles(double horsePower) {
        this.horsePower = horsePower;
    }

    public PersonalMotorcycles(String vehicleType, double horsePower) {
        super(vehicleType);
        this.horsePower = horsePower;
    }

    public PersonalMotorcycles(String producer, int yearOfProduction, double price, String color, String vehicleType, double horsePower) {
        super(producer, yearOfProduction, price, color, vehicleType);
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + getVehicleType() + ", producer: " + getProducer() +
                ", Year Of Production: " + getYearOfProduction() + ", price: " + getPrice() + " USD" +
                ", color: " + getColor() + ", horsePower: " + getHorsePower() + "\n";
    }
}
