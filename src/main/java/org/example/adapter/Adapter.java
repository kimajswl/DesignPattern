package org.example.adapter;

public class Adapter implements Behavior{
    private final Robot robot;

    public Adapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void doWork(int robotNumber) {
        robot.Work(robotNumber);
    }

    @Override
    public void doWalk(int robotNumber) {
        robot.Walk(robotNumber);
    }
}
