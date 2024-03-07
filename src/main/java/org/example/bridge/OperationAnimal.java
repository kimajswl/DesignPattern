package org.example.bridge;

public class OperationAnimal implements Operation{
    protected Animal animal;

    public OperationAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void giveFood() {
        if(animal.getHungry() <= 0) {
            System.out.println("배부름");
        }
        else {
            System.out.println("동물에게 먹이를 줌");
            animal.setHungry(animal.getHungry() - 10);
        }
    }

    @Override
    public void play() {
        if(animal.getBoring() <= 0) {
            System.out.println("지침");
        }
        else {
            System.out.println("놀아줌");
            animal.setBoring(animal.getBoring() - 10);
        }
    }

    @Override
    public void putToSleep() {
        if(animal.isSleepy() == true) {
            System.out.println("Zzzzzz.....");
        }
        else System.out.println("잠이 안옴");
    }

    @Override
    public void reset() {
        animal.setBoring(100);
        animal.setHungry(100);;
    }
}
