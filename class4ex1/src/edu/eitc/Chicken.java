package edu.eitc;

public class Chicken {
    static final int numberOfLegs = 2;

    static void printDesription(){
        System.out.println("Chicken is a kind of bird.");
    }

    private String name;
    Chicken(String name){
        this.name = name;
    }

    void printNameHasLegs(){
        System.out.println(name + " has " + numberOfLegs + " legs.");
    }
}
