package org.example.flyweight;

public class Character implements CharacterModel{
    private String name;
    private int attackPower;

    public Character(String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int getAttackPower() {
        return attackPower;
    }

}
