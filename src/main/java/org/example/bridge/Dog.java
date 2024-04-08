package org.example.bridge;

public class Dog implements Animal{
    private final Sound sound;

    public Dog(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void cryingSound() {
        System.out.println("강아지: ");
        sound.sound();
    }
}
