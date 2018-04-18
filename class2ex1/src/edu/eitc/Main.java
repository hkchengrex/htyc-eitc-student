package edu.eitc;

public class Main {

    public static void main(String[] args) {
        Customer customer = new VIPCustomer("Normal Guy", 1000);
	    System.out.println(customer.name);

        VIPCustomer vipCustomer = new VIPCustomer("Rich guy", 1000);
        System.out.println(vipCustomer.name);

        BlacklistCustomer blacklistCustomer = new BlacklistCustomer("Black guy", 1000);
        System.out.println(blacklistCustomer.name);
    }
}
