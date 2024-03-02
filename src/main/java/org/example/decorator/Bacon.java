package org.example.decorator;

public class Bacon extends SandwichDecorator{
    public Bacon(Subway decoratedSandwich) {
        super(decoratedSandwich);
    }

    public String getOrder() {
        return decoratedSandwich.getOrder() + " + 베이컨";
    }

    public int breadPrice() {
        return decoratedSandwich.breadPrice() + 900;
    }
}
