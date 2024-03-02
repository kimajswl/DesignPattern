package org.example.composite;

public class LeafMenuItem implements ComponentMenuItem {
    private String name;
    private int price;

    public LeafMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name + " - " + price + " 원");
    }
}
