package Controller;


import Model.Produkt;
import View.ProduktView;

import java.util.ArrayList;
import java.util.List;

public class ProduktController {
    private final List<Produkt> Produkts = new ArrayList<>();
    private final ProduktView ProduktView;

    public ProduktController(ProduktView ProduktView) {
        this.ProduktView = ProduktView;
    }

    public void addProdukt() {
        Produkt Produkt = ProduktView.getProduktDetails();
        Produkts.add(Produkt);
        System.out.println("Produkt added successfully!");
    }

    public void modifyProdukt(String name) {
        for (Produkt Produkt : Produkts) {
            if (Produkt.getName().equalsIgnoreCase(name)) {
                Produkt updatedProdukt = ProduktView.getProduktDetails();
                Produkt.setName(updatedProdukt.getName());
                Produkt.setPrice(updatedProdukt.getPrice());
                Produkt.setRegion(updatedProdukt.getRegion());
                System.out.println("Produkt modified successfully!");
                return;
            }
        }
        System.out.println("Produkt not found!");
    }

    public void displayProdukts() {
        ProduktView.displayProdukts(Produkts);
    }
}

