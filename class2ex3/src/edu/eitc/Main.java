package edu.eitc;

public class Main {

    public static void main(String[] args) {
        Car normalCar = new Car("Blue");
        System.out.println("This is a normal car.");
        System.out.println("It's color is " + normalCar.getColor());
        if (normalCar.isPriority()){
            System.out.println("It is a priority car.");
        }else{
            System.out.println("It is not a priority car.");
        }
        System.out.println("Listen to its sound! ");
        normalCar.makeSound();
        System.out.println();

        Ambulance ambulance = new Ambulance();
        System.out.println("This is an ambulance.");
        System.out.println("It's color is " + ambulance.getColor());
        if (ambulance.isPriority()){
            System.out.println("It is a priority car.");
        }else{
            System.out.println("It is not a priority car.");
        }
        System.out.println("Listen to its sound! ");
        ambulance.makeSound();
        System.out.println();

        PoliceCar policeCar = new PoliceCar("Black", "5575");
        System.out.println("This is a policeCar.");
        System.out.println("It's color is " + policeCar.getColor());
        System.out.println("It's id is " + policeCar.getPoliceID());
        if (policeCar.isPriority()){
            System.out.println("It is a priority car.");
        }else{
            System.out.println("It is not a priority car.");
        }
        System.out.println("Listen to its sound! ");
        policeCar.makeSound();
        System.out.println();
    }
}
