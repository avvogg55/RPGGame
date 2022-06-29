package com.company;

public class Mage extends GameCharacter{

    public Mage(double health, int minDamage, int maxDamage, int number){
        super(health, minDamage,maxDamage,number);
    }

    @Override
    public String toString() {
        return this.getPlayerName() + " Маг " + super.toString();
    }
}
