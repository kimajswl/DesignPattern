package org.example.flyweight;

import java.util.Map;

public class FlyweightClient {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        System.out.println("\n밍밍1: " + characterFactory.createCharacter("밍밍", 100).hashCode() + "\n");
        System.out.println("밍밍2: " + characterFactory.createCharacter("밍밍", 150).hashCode() + "\n");
        System.out.println("빅보: " + characterFactory.createCharacter("빅보", 500).hashCode() + "\n");
        System.out.println("카이: " + characterFactory.createCharacter("카이", 300).hashCode() + "\n");
    }
}
