package edu.eitc;

public class Car {
    private final String color;

    public Car(String inputColor){
        color = inputColor;
    }

    boolean isPriority(){
        return false;
    }

    String getColor(){
        return color;
    }

    void makeSound() {
        System.out.println("honk - honk");
    }
}
