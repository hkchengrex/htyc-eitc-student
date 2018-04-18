package edu.eitc;

public class VIPCustomer extends Customer{
    public VIPCustomer(String inputName, double deposit){
        super(inputName, deposit);
    }

//    @Override
//    boolean canBuy(double cost){
//        return cost*0.5 < balance;
//    }

    @Override
    double getDiscount(){
        return 0.5;
    }
}
