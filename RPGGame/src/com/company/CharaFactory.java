package com.company;

public enum CharaFactory {
    WARRIOR(1,"Воин") {
        @Override
        public GameCharacter getGameCharacter() {
            return new Warrior(1000,50,100,1,0.5);
        }
    },
    ARCHER(2,"Лучник") {
        @Override
        public GameCharacter getGameCharacter() {
            return new Archer(800, 0.3,80,130,2);
        }
    },
    MAGE(3,"Маг") {
        @Override
        public GameCharacter getGameCharacter() {
            return new Mage(600,50,70,3);
        }
    };

    private int number;

    private String charaName;

    CharaFactory(int number, String charaName){
        this.number = number;
        this.charaName = charaName;
    }

    public abstract GameCharacter getGameCharacter();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCharaName() {
        return charaName;
    }

    public void setCharaName(String charaName) {
        this.charaName = charaName;
    }
}
