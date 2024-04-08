package org.example.composite;

public class LeafMenu extends ComboMenu {
    private String name;
    private int price;

    public LeafMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
