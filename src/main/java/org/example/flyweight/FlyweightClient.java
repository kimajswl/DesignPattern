package org.example.flyweight;

public class FlyweightClient {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        System.out.println(characterFactory.createCharacter("밍밍", 100));
        System.out.println(characterFactory.createCharacter("밍밍", 150));
        System.out.println(characterFactory.createCharacter("빅보", 500));
        System.out.println(characterFactory.createCharacter("카이", 300));
    }
}
