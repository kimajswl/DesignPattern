package org.example.bridge;

public class OperationApp extends OperationAnimal{

    public OperationApp(Animal animal) {
        super(animal);
    }

    public void outApp() {
        System.out.println("******** 앱 닫기 ********");
    }

    public void inApp() {
        System.out.println("******** 앱 실행 ********");
    }
}
