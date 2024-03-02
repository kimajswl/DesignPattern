package org.example.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Behavior behavior = new Adapter(robot);

        behavior.doWalk(1);
        behavior.doWork(5);

    }
}
