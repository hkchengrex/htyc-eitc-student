package edu.eitc;

public class BlacklistCustomer extends Customer{
    public BlacklistCustomer(String inputName, double deposit){
        super(inputName, deposit);
    }

    @Override
    boolean canBuy(double cost){
        return false;
    }
}
