package org.example.bridge;

public class Cat implements Animal{
    private int hungryPercent = 30;
    private int boringPercent = 0;
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
        System.out.println("-------------------------------------");
        System.out.println("| 고양이");
        System.out.println("| 배고픔 - " + hungryPercent);
        System.out.println("| 지루함 - " + boringPercent );
        System.out.println("| 졸림 -  " + (sleepy ? "T" : "F"));
        System.out.println("------------------------------------\n");
    }


}
