public class PersonalCars extends Cars{
    private int seat;
    private String engineType;

    public PersonalCars(){}

    public PersonalCars(int seat, String engineType) {
        this.seat = seat;
        this.engineType = engineType;
    }

    public PersonalCars(String vehicleType, int seat, String engineType) {
        super(vehicleType);
        this.seat = seat;
        this.engineType = engineType;
    }

    public PersonalCars(String producer, int yearOfProduction, double price, String color, String vehicleType, int seat, String engineType) {
        super(producer, yearOfProduction, price, color, vehicleType);
        this.seat = seat;
        this.engineType = engineType;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + getVehicleType() + ", producer: " + getProducer() +
                ", Year Of Production: " + getYearOfProduction() + ", price: " + getPrice() + " USD" +
                ", color: " + getColor() + ", seat: " + getSeat() + ", Engine Type: " + getEngineType() + "\n";
    }
}
