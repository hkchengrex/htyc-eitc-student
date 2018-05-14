package edu.eitc;

public abstract class Car {
    private String color = "White";

    public void makeSound(){
        System.out.println("Car making sound");
    }

    public String getColor(){
        return color;
    }
}
