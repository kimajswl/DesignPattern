package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<String, Character> CharacterMap = new HashMap<>();

    public Map<String, Character> createCharacter(String name, int attackPower) {
        CharacterModel characterModel = CharacterMap.get(name);

        if(characterModel == null) {
            Character character1 = new Character(name, attackPower);
            CharacterMap.put(character1.getName(), character1);
        }
        return CharacterMap;
    }
}
