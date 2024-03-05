package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<String, Character> CharacterMap = new HashMap<>();

    public Map<String, Character> createCharacter(String name, int attackPower) {
        Character character = new Character(name, attackPower);
        CharacterModel characterModel = CharacterMap.get(character.getName());

        if(characterModel == null) {
            Character character1 = new Character(character.getName(), character.getAttackPower());
            CharacterMap.put(character.getName(), character1);
        }
            return CharacterMap;
    }
}
