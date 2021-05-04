import java.io.Serializable;

public class Vehicle implements Serializable {
    private String producer;
    private int yearOfProduction;
    private double price;
    private String color;

    public Vehicle(){}

    public Vehicle(String producer, int yearOfProduction, double price, String color) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
