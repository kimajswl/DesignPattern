package org.example.decorator;

public abstract class SandwichDecorator implements Subway{
    protected Subway decoratedSandwich;

    public SandwichDecorator(Subway decoratedCoffee) {
        this.decoratedSandwich = decoratedCoffee;
    }

    public String getOrder() {
        return decoratedSandwich.getOrder();
    }

    public int breadPrice() {
        return decoratedSandwich.breadPrice();
    }
}
