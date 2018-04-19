package edu.eitc;

public class PriorityCar extends Car{
    public PriorityCar(String inputColor){
        super(inputColor);
    }

    @Override
    boolean isPriority(){
        return true;
    }

    @Override
    void makeSound() {
        System.out.println("WeeeeeeeeeWeeeeeeee");
    }
}
