package org.example.composite;

public class LeafMenu implements Menu {
    private String name;
    private int price;

    public LeafMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name + " - " + price + " 원");
    }
}
