package edu.eitc;

public class Warrior extends Unit{

    Warrior(){
        super(100, 1);
    }

    @Override
    void attack(int range){
        if (withinAttackRange(range)) {
            System.out.println("Warrior slashes with his sword!");
        }else{
            System.out.println("Warrior tried to attack, but he cannot reached his target!");
        }
    }

    void rest(){
        System.out.println("Resting...");
        health += 10;
    }
}
