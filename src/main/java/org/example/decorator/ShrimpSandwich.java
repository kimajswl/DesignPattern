package org.example.decorator;

public class ShrimpSandwich implements Subway{

    @Override
    public String getOrder() {
        return "새우 샌드위치";
    }

    @Override
    public int breadPrice() {
        return 6000;
    }
}
