package com.company;

import java.util.ArrayList;

public class CharaCollection {

    public ArrayList<GameCharacter> des = new ArrayList<>();

    public CharaCollection(){
    }

    public ArrayList<GameCharacter> getDes() {
        return des;
    }

    public void setDes(ArrayList<GameCharacter> des) {
        this.des = des;
    }

    public void addCharacter(GameCharacter gC){
        des.add(gC);
    }

    public void removeCharacter(GameCharacter gC){
        des.remove(gC);
    }



    @Override
    public String toString() {
        return "Список Персонажей{ " + des + " }";
    }

}
