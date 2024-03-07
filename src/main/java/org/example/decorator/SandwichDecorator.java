package org.example.decorator;

public class SandwichDecorator implements Subway{
    protected Subway subway;

    public SandwichDecorator(Subway subway) {
        this.subway = subway;
    }

    public String getOrder() {
        return subway.getOrder();
    }

    public int breadPrice() {
        return subway.breadPrice();
    }
}
