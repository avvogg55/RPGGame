package com.company;

public class Archer extends GameCharacter {

    public Archer(double health, double critDmgChance, int minDamage, int maxDamage, int number){
        super(health,critDmgChance,minDamage,maxDamage,number);
    }

    @Override
    public String toString() {
        return this.getPlayerName() + " Лучник " + super.toString();
    }
}
