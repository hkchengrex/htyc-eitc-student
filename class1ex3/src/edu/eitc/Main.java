package edu.eitc;

public class Main {

    public static void main(String[] args) {
        //Method 1
        GoodNamePrinter printer1 = new GoodNamePrinter();
        printer1.setName("Chicken");
        printer1.printName();
        printer1.setName("Parrot");
        printer1.printName();

        //Method 2
        GoodNamePrinter chickenPrinter = new GoodNamePrinter();
        chickenPrinter.setName("Chicken");
        chickenPrinter.printName();

        GoodNamePrinter parrotPrinter = new GoodNamePrinter();
        parrotPrinter.setName("Parrot");
        parrotPrinter.printName();
    }
}
