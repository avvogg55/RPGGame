package com.company;

public class Warrior extends GameCharacter{

    public Warrior(double health, int minDamage, int maxDamage, int number, double dmgResist){
        super(health,minDamage,maxDamage,number,dmgResist);

    }

    @Override
    public String toString() {
        return this.getPlayerName() + " Воин " + super.toString();
    }
}
