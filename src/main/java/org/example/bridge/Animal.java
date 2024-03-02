package org.example.bridge;

public interface Animal {
    int getHungry();

    void setHungry(int hungryPercent);

    int getBoring();

    void setBoring(int boringPercent);

    boolean isSleepy();

    void sleepy(int hungryPercent, int boringPercent);

    void printStatus();
}