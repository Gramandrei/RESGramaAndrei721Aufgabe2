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
    }
}
