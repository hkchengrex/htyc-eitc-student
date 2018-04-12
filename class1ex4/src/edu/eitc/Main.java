package edu.eitc;

public class Main {

    public static void main(String[] args) {
        ConstructNamePrinter samPrinter = new ConstructNamePrinter("Sam");
        samPrinter.printName();

        ConstructNamePrinter tomPrinter = new ConstructNamePrinter("Tom");
        tomPrinter.printName();
    }
}
