package org.example.bridge;

public class Cat implements Animal{
    private final Sound sound;

    public Cat(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void cryingSound() {
        System.out.println("고양이: ");
        sound.sound();
    }
}
