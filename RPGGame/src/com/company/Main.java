package com.company;

import java.util.Scanner;

public class Main {

    private static GameCharacter secondPlayer;

    private static GameCharacter firstPlayer;

    public static void main(String[] args) {

        CharaCollection charaCollection = new CharaCollection();

        charaCollection.addCharacter(CharaFactory.WARRIOR.getGameCharacter());
        charaCollection.addCharacter(CharaFactory.ARCHER.getGameCharacter());
        charaCollection.addCharacter(CharaFactory.MAGE.getGameCharacter());

        System.out.println("Драка средневековых алкашей фантазеров");

        Core.choosingCharacter(firstPlayer,secondPlayer,charaCollection);







    }
}
