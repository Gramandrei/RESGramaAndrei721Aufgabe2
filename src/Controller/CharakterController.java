package Controller;


import Model.Charakter;
import View.CharakterView;

import java.util.ArrayList;
import java.util.List;

public class CharacterController {
    private final List<Character> characters = new ArrayList<>();
    private final CharacterView characterView;

    public CharacterController(CharacterView characterView) {
        this.characterView = characterView;
    }

    public void addCharacter() {
        Character character = characterView.getCharacterDetails();
        characters.add(character);
        System.out.println("Character added successfully!");
    }

    public void modifyCharacter(int id) {
        for (Character character : characters) {
            if (character.getId() == id) {
                Character updatedCharacter = characterView.getCharacterDetails();
                character.setName(updatedCharacter.getName());
                character.setLocation(updatedCharacter.getLocation());
                System.out.println("Character modified successfully!");
                return;
            }
        }
        System.out.println("Character not found!");
    }

    public void displayCharacters() {
        characterView.displayCharacters(characters);
    }
}

