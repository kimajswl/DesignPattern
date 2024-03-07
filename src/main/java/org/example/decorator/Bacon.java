package org.example.decorator;

public class Bacon extends SandwichDecorator{
    public Bacon(Subway subway) {
        super(subway);
    }

    public String getOrder() {
        return subway.getOrder() + " + 베이컨";
    }

    public int breadPrice() {
        return subway.breadPrice() + 900;
    }
}
