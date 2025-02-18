package Model;

public class Produkte {
    private String name;
    private double price;
    private String region;

    public Produkte(String name, double price, String region) {
        this.name = name;
        this.price = price;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", region='" + region + "'}";
    }
}

