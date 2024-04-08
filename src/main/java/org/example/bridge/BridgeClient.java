package org.example.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        Sound dogSound = new Woof();
        Sound catSound = new Meow();

        Animal dog = new Dog(dogSound);
        dog.cryingSound();

        Animal cat = new Cat(catSound);
        cat.cryingSound();
    }
}
