package View;


import Model.Produkt;

import java.util.List;
import java.util.Scanner;

public class ProduktView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayProdukts(List<Produkt> Produkts) {
        System.out.println("Produkt List:");
        for (Produkt Produkt : Produkts) {
            System.out.println(Produkt);
        }
    }

    public Produkt getProduktDetails() {
        System.out.print("Enter Produkt name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Produkt price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Produkt region: ");
        String region = scanner.nextLine();
        return new Produkt(name, price, region);
    }
}
