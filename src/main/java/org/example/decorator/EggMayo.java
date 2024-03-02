package org.example.decorator;

public class EggMayo extends SandwichDecorator{
    public EggMayo(Subway decoratedSandwich) {
        super(decoratedSandwich);
    }

    public String getOrder() {
        return decoratedSandwich.getOrder() + " + 에그 마요";
    }

    public int breadPrice() {
        return decoratedSandwich.breadPrice() + 1500;
    }
}
