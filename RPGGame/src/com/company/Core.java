package com.company;

import java.util.Scanner;

public class Core {

    private static int roundCounter = 1;

    private static int decision;


    public static void choosingCharacter(GameCharacter fP,GameCharacter sP,CharaCollection cC){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-й игрок выбирает персонажа");
        System.out.println(cC);
        System.out.println("Введите номер персонажа из списка и нажмите Enter");

        int decision1 = scanner.nextInt();

        System.out.println();

        for (CharaFactory c : CharaFactory.values()) {
            if (c.getNumber() == decision1 ) {
                fP = c.getGameCharacter();
                //System.out.println("Игрок 1, введите свое имя");
                //firstPlayer.setPlayerName(scanner.next());
                fP.setPlayerName("Игрок 1");
                System.out.println(fP.getPlayerName() + " выбрал персонажа " + c.getCharaName());
            }
        }

        System.out.println();

        System.out.println("2-й игрок выбирает персонажа из списка");
        System.out.println(cC);
        System.out.println("Введите номер персонажа из списка и нажмите Enter");

        int decision2 = scanner.nextInt();

        System.out.println();

        for (CharaFactory c : CharaFactory.values()) {
            if (c.getNumber() == decision2) {
                sP = c.getGameCharacter();
                //System.out.println("Игрок 2, введите свое имя");
                //secondPlayer.setPlayerName(scanner.next());
                sP.setPlayerName("Игрок 2");
                System.out.println(sP.getPlayerName() + " выбрал персонажа " + c.getCharaName());
            }
        }

        System.out.println();

        System.out.println(sP + " \n" + sP + "\n");

        System.out.println();

        System.out.println("Да начнется  битва!");

        try{
            roundP1P2(fP,sP);
        } catch(NullPointerException e) {
            System.out.println("Персонажей с такими номерами нет, пожалуйста выберите заново");
            choosingCharacter(fP, sP, cC);
        }
    }


    public static void roundP1P2(GameCharacter c1, GameCharacter c2) {
        if(c1.getHealth() > 0 && c2.getHealth() > 0) {
            System.out.println(roundCounter + " раунд");
            Scanner scanner = new Scanner(System.in);
            System.out.println(c1.getPlayerName() + " выберите действие \n1. Атаковать \n2. Использовать способность(пока что просто пропускает ход) \n");
            decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    c1.hitEnemy(c2);
                    break;
                case 2:
                    break;
            }
            roundCounter++;
            System.out.println();
            System.out.println(c1 + " \n" + c2 + "\n");
            roundP2P1(c1,c2);
        } else {
            System.out.println("Игра окончена");
            if(c1.getHealth() <= 0){
                System.out.println(c1 + " проиграл");
            }
            if(c2.getHealth() <= 0){
                System.out.println(c2 + " проиграл");
            }
        }


    }


    public static void roundP2P1(GameCharacter c1, GameCharacter c2) {
        if(c1.getHealth() > 0 && c2.getHealth() > 0) {
            System.out.println(roundCounter + " раунд");
            Scanner scanner = new Scanner(System.in);
            System.out.println(c2.getPlayerName() + " выберите действие \n1. Атаковать \n2. Использовать способность(пока что просто пропускает ход) \n");
            decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    c2.hitEnemy(c1);
                    break;
                case 2:
                    break;
            }
            roundCounter++;
            System.out.println();
            System.out.println(c1 + " \n" + c2 + "\n");
            roundP1P2(c1,c2);
        } else {
            System.out.println("Игра окончена");
            if(c1.getHealth() <= 0){
                System.out.println(c1 + " проиграл");
            }
            if(c2.getHealth() <= 0){
                System.out.println(c2 + " проиграл");
            }
        }
    }
}
