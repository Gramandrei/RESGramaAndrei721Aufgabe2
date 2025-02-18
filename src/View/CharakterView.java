package View;


import Model.Charakter;

import java.util.List;
import java.util.Scanner;

public class CharakterView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayCharakters(List<Charakter> Charakters) {
        System.out.println("Charakter List:");
        for (Charakter Charakter : Charakters) {
            System.out.println(Charakter);
        }
    }

    public Charakter getCharakterDetails() {
        System.out.print("Enter Charakter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Charakter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Charakter location: ");
        String location = scanner.nextLine();
        return new Charakter(id, name, location);
    }
}
