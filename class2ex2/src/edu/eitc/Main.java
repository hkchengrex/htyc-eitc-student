package edu.eitc;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Normal Guy", 1000);
	    System.out.println("Normal Customer: " + customer.name);
	    System.out.println("Discount: " + customer.getDiscount());
	    System.out.println("Can afford $500 meal: " + customer.canBuy(500));
        System.out.println("Can afford $1200 meal: " + customer.canBuy(1200));
        System.out.println("Can afford $2500 meal: " + customer.canBuy(2500));
        System.out.println();

        VIPCustomer vipCustomer = new VIPCustomer("Rich guy", 1000);
        System.out.println("VIP Customer: " + vipCustomer.name);
        System.out.println("Discount: " + vipCustomer.getDiscount());
        System.out.println("Can afford $500 meal: " + vipCustomer.canBuy(500));
        System.out.println("Can afford $1200 meal: " + vipCustomer.canBuy(1200));
        System.out.println("Can afford $2500 meal: " + vipCustomer.canBuy(2500));
        System.out.println();

        SuperVIPCustomer superVIPCustomer = new SuperVIPCustomer("Rich guy", 1000);
        System.out.println("Super VIP Customer: " + superVIPCustomer.name);
        System.out.println("Discount: " + superVIPCustomer.getDiscount());
        System.out.println("Can afford $500 meal: " + superVIPCustomer.canBuy(500));
        System.out.println("Can afford $1200 meal: " + superVIPCustomer.canBuy(1200));
        System.out.println("Can afford $2500 meal: " + superVIPCustomer.canBuy(2500));
        System.out.println();

        BlacklistCustomer blacklistCustomer = new BlacklistCustomer("Black guy", 1000);
        System.out.println("Blacklisted Customer: " + blacklistCustomer.name);
        System.out.println("Discount: " + blacklistCustomer.getDiscount());
        System.out.println("Can afford $500 meal: " + blacklistCustomer.canBuy(500));
        System.out.println("Can afford $1200 meal: " + blacklistCustomer.canBuy(1200));
        System.out.println("Can afford $2500 meal: " + blacklistCustomer.canBuy(2500));
        System.out.println();
    }
}
