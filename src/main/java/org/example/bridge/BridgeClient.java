package org.example.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        testAnimal(new Cat());
        testAnimal(new Dog());
    }

    public static void testAnimal(Animal animal) {
        OperationApp operationApp = new OperationApp(animal);
        OperationAnimal operationAnimal = new OperationAnimal(animal);

        operationApp.inApp();
        animal.printStatus();

        operationAnimal.giveFood();
        operationAnimal.play();
        operationAnimal.putToSleep();
        animal.printStatus();

        operationApp.outApp();
        System.out.println("\n");
    }
}
