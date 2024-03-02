package org.example.bridge;

public class OperationApp extends OperationAnimal{

    public OperationApp(Animal animal) {
        super(animal);
    }

    public void outApp() {
        System.out.println("******** Close the app ********");
    }

    public void inApp() {
        System.out.println("******** Open the app ********");
    }
}
