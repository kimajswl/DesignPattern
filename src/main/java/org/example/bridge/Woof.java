package org.example.bridge;

public class Woof implements Sound{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
