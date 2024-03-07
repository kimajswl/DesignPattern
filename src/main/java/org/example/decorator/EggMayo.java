package org.example.decorator;

public class EggMayo extends SandwichDecorator{
    public EggMayo(Subway subway) {
        super(subway);
    }

    public String getOrder() {
        return subway.getOrder() + " + 에그 마요";
    }

    public int breadPrice() {
        return subway.breadPrice() + 1500;
    }
}
