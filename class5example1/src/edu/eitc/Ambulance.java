package edu.eitc;

public class Ambulance extends Car{
    @Override
    public void makeSound(){
        System.out.println("Ambulance making sound");
    }

    public void savePeople(){
        System.out.println("Saved!");
    }
}
