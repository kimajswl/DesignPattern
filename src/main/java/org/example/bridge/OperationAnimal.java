package org.example.bridge;

public class OperationAnimal implements Operation{
    protected Animal animal;

    public OperationAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void giveFood() {
        if(animal.getHungry() <= 0) {
            System.out.println("Full");
        }
        else {
            System.out.println("Feed the animals");
            animal.setHungry(animal.getHungry() - 10);
        }
    }

    @Override
    public void play() {
        if(animal.getBoring() <= 0) {
            System.out.println("Tired");
        }
        else {
            System.out.println("Play with animals");
            animal.setBoring(animal.getBoring() - 10);
        }
    }

    @Override
    public void putToSleep() {
        if(animal.isSleepy() == true) {
            System.out.println("Zzzzzz.....");
        }
        else System.out.println("I don't want to sleep!!");
    }

    @Override
    public void reset() {
        animal.setBoring(100);
        animal.setHungry(100);;
    }
}
