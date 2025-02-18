package Controller;


import Model.Charakter;
import View.CharakterView;

import java.util.ArrayList;
import java.util.List;

public class CharakterController {
    private final List<Charakter> Charakters = new ArrayList<>();
    private final CharakterView CharakterView;

    public CharakterController(CharakterView CharakterView) {
        this.CharakterView = CharakterView;
    }

    public void addCharakter() {
        Charakter Charakter = CharakterView.getCharakterDetails();
        Charakters.add(Charakter);
        System.out.println("Charakter added successfully!");
    }

    public void modifyCharakter(int id) {
        for (Charakter Charakter : Charakters) {
            if (Charakter.getId() == id) {
                Charakter updatedCharakter = CharakterView.getCharakterDetails();
                Charakter.setName(updatedCharakter.getName());
                Charakter.setLocation(updatedCharakter.getLocation());
                System.out.println("Charakter modified successfully!");
                return;
            }
        }
        System.out.println("Charakter not found!");
    }

    public void displayCharakters() {
        CharakterView.displayCharakters(Charakters);
    }
}

