package edu.eitc;

public class Customer {
    final String name;
    protected double balance;

    public Customer(String inputName, double deposit){
        name = inputName;
        balance = deposit;
    }

    boolean canBuy(double cost){
        return cost < balance;
    }
}
