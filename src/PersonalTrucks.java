public class PersonalTrucks extends Trucks {
    private int loadingCapacity;

    public PersonalTrucks() {
    }

    public PersonalTrucks(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public PersonalTrucks(String vehicleType, int loadingCapacity) {
        super(vehicleType);
        this.loadingCapacity = loadingCapacity;
    }

    public PersonalTrucks(String producer, int yearOfProduction, double price, String color, String vehicleType, int loadingCapacity) {
        super(producer, yearOfProduction, price, color, vehicleType);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + getVehicleType() + ", producer: " + getProducer() +
                ", Year Of Production: " + getYearOfProduction() + ", price: " + getPrice() + " USD" +
                ", color: " + getColor() + ", seat: " + ", loadingCapacity: " + loadingCapacity + " KG\n";
    }
}
