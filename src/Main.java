//import org.json.JSONArray;
//import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


import Controller.CharakterController;
import Controller.ProduktController;
import Model.Charakter;
import Model.Produkt;
import View.CharakterView;
import View.ProduktView;

public class Main {
    public static void main(String[] args) {
        ProduktView ProduktView = new ProduktView();
        CharakterView CharakterView = new CharakterView();

        ProduktController ProduktController = new ProduktController(ProduktView);
        CharakterController CharakterController = new CharakterController(CharakterView);

        // Adaugare produs
        ProduktController.addProdukt();

        // Modificare produs
        ProduktController.modifyProdukt("Wine");

        // Afișare produse
        ProduktController.displayProdukts();

        // Adaugare personaj
        CharakterController.addCharakter();

        // Modificare personaj
        CharakterController.modifyCharakter(1);

        // Afișare personaje
        CharakterController.displayCharakters();

//        e) Sortieren der Produkte eines Charakters nach Preis (1
//                Punkt)
//        Der Benutzer wählt einen Charakter und gibt die Sortierart ein: - Aufsteigend (günstigster zuerst) - Absteigend (teuerster zuerst)
//        Input:
//        Output:
//        Charakter: Thor
//        Sortierreihenfolge:
//        Absteigend
//        Darkhold - 2000.0
//        Norn Stones - 1200.0
//        Mjolnir - 500.0

        // Initialisierung der Produkte 
        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Mjolnir", 500.0, "Asgard"));
        produkte.add(new Produkt("Vibranium-Schild", 700.0, "Wakanda"));
        produkte.add(new Produkt("Infinity Gauntlet", 10000.0, "Titan"));
        produkte.add(new Produkt("Web-Shooter", 250.0, "Terra"));
        produkte.add(new Produkt("Arc-Reaktor", 1500.0, "Terra"));
        produkte.add(new Produkt("Norn Stones", 1200.0, "Asgard"));
        produkte.add(new Produkt("Quantum Suit", 3000.0, "Terra"));
        produkte.add(new Produkt("X-Gene Serum", 850.0, "X-Mansion"));
        produkte.add(new Produkt("Cosmic Cube", 9000.0, "Multiverse"));
        produkte.add(new Produkt("Darkhold", 2000.0, "Multiverse"));

        // Initialisierung der Charaktere 
        List<Charakter> charaktere = new ArrayList<>();

        Charakter c1 = new Charakter(1, "Thor", "Asgard");
        c1.kaufeProdukt(produkte.get(0)); // Mjolnir
        c1.kaufeProdukt(produkte.get(5)); // Norn Stones
        c1.kaufeProdukt(produkte.get(9)); // Darkhold

        Charakter c2 = new Charakter(2, "Black Panther", "Wakanda");
        c2.kaufeProdukt(produkte.get(1)); // Vibranium-Schild
        c2.kaufeProdukt(produkte.get(7)); // X-Gene Serum

        Charakter c3 = new Charakter(3, "Iron Man", "Terra");
        c3.kaufeProdukt(produkte.get(4)); // Arc-Reaktor
        c3.kaufeProdukt(produkte.get(6)); // Quantum Suit
        c3.kaufeProdukt(produkte.get(3)); // Web-Shooter

        Charakter c4 = new Charakter(4, "Spider-Man", "Terra");
        c4.kaufeProdukt(produkte.get(3)); // Web-Shooter
        c4.kaufeProdukt(produkte.get(8)); // Cosmic Cube

        Charakter c5 = new Charakter(5, "Doctor Strange", "Multiverse");
        c5.kaufeProdukt(produkte.get(9)); // Darkhold
        c5.kaufeProdukt(produkte.get(8)); // Cosmic Cube
        c5.kaufeProdukt(produkte.get(2)); // Infinity Gauntlet

        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);

        //CharakterController.sortProductsByPrice(Thor, "Absteigend");

    }
}
