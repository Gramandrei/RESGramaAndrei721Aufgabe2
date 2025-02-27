package Model;


import java.util.ArrayList;
import java.util.List;

public class Charakter {
    private int id;
    private String name;
    private String location;
    private List<Produkt> purchasedProducts;

    public Charakter(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.purchasedProducts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Produkt> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void addProduct(Produkt product) {
        this.purchasedProducts.add(product);
    }

    @Override
    public String toString() {
        return "Character{id=" + id + ", name='" + name + "', location='" + location + "', purchasedProducts=" + purchasedProducts + "}";
    }

    public void kaufeProdukt(Produkt produkt) {
        purchasedProducts.add(produkt);
    }
}

