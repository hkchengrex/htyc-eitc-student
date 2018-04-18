package edu.eitc;

public class SuperVIPCustomer extends VIPCustomer{
    public SuperVIPCustomer(String inputName, double deposit){
        super(inputName, deposit);
    }

//    @Override
//    boolean canBuy(double cost){
//        return cost*0.2 < balance;
//    }

    @Override
    double getDiscount(){
        return 0.2;
    }
}
