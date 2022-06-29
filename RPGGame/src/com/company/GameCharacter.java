package com.company;

public abstract class GameCharacter {
    private int number;
    private double health;
    private int minDamage;
    private int maxDamage;
    private String playerName = "";
    private double dmgResist = 0;
    private double critDmgChance = 0;

    public GameCharacter(){
    }

    public GameCharacter(double health, int minDamage, int maxDamage, int number, double dmgResist, double critDmgChance){
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.number = number;
        this.dmgResist = dmgResist;
        this.critDmgChance = critDmgChance;
    }

    public GameCharacter(double health, int minDamage, int maxDamage, int number, double dmgResist){
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.number = number;
        this.dmgResist = dmgResist;
    }

    public GameCharacter(double health, int minDamage, int maxDamage, int number){
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.number = number;
    }

    public GameCharacter(double health, double critDmgChance, int minDamage, int maxDamage, int number){
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.number = number;
        this.critDmgChance = critDmgChance;
    }

    @Override
    public String toString() {
        return "[Здоровье = " + health +
                ", Урон = " + minDamage +
                " - " + maxDamage + ", Сопротивление урону = " + dmgResist * 100 + " %, Шанс крита = " + critDmgChance * 100 +
                " %] номер (" + number + ") ";
    }

    public int getRandDamage(){
        int max = maxDamage;
         max -= minDamage;
        return (int) (Math.random() * ++max) + minDamage;
    }

    public int getRandRangeInt(int min,int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void hitEnemy(GameCharacter c) {
        System.out.print(this.getPlayerName() + " ударил " + c.getPlayerName() + " и нанес ");
        double dmg = this.getRandDamage();
        dmg = dmg - (dmg * c.getDmgResist());
        double cDC = this.getCritDmgChance() * 10;
        if((int) cDC == getRandRangeInt(1,(int) cDC)){         //работает только для шанса 30% надо переделать
            System.out.print("{Сработал модификатор критического урона} ");
            dmg*=2;
        }
        c.setHealth(c.getHealth() - dmg);
        System.out.println(dmg + " урона!");
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getDmgResist() {
        return dmgResist;
    }

    public void setDmgResist(double dmgResist) {
        this.dmgResist = dmgResist;
    }

    public double getCritDmgChance() {
        return critDmgChance;
    }

    public void setCritDmgChance(double critDmgChance) {
        this.critDmgChance = critDmgChance;
    }
}
