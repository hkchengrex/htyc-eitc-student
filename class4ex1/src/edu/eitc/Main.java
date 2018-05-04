package edu.eitc;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        Chicken.printDesription();

        Chicken tom = new Chicken("Tom");
        tom.printNameHasLegs();
    }
}
