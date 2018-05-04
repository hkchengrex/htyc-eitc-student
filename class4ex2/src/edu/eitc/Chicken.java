package edu.eitc;

public class Chicken {
    static final int numberOfLegs = 2;
    static int chickenCount = 0;

    static void printDesription(){
        System.out.println("Chicken is a kind of bird.");
    }

    private String name;
    Chicken(String name){
        this.name = name;
        chickenCount++;
    }

    void printNameHasLegs(){
        System.out.println(name + " has " + numberOfLegs + " legs.");
    }

    Egg layEgg(){
        return new Egg(name);
    }
}
