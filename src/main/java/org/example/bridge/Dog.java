package org.example.bridge;

public class Dog implements Animal{
    private int hungryPercent = 0;
    private int boringPercent = 50;
    private boolean sleepy = false;


    @Override
    public int getHungry() {
        return hungryPercent;
    }

    @Override
    public void setHungry(int hungryPercent) {
        this.hungryPercent = hungryPercent;
    }

    @Override
    public int getBoring() {
        return boringPercent;
    }

    @Override
    public void setBoring(int boringPercent) {
        this.boringPercent = boringPercent;
    }

    @Override
    public boolean isSleepy() {
        return sleepy;
    }

    @Override
    public void sleepy(int hungryPercent, int boringPercent) {
        if(hungryPercent == 0 && boringPercent == 0) this.sleepy = true;
        else this.sleepy = false;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm dog");
        System.out.println("| I'm " + hungryPercent + " hungry.");
        System.out.println("| I'm " + boringPercent + " boring.");
        System.out.println("| I'm " + (sleepy ? "sleepy." : "Not sleepy."));
        System.out.println("------------------------------------\n");
    }
}
