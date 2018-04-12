package edu.eitc;

public class ConstructNamePrinter {
    private final String name;

    ConstructNamePrinter(String input_name){
        name = input_name;

    }

    void printName(){
        System.out.println(name);
    }
}
