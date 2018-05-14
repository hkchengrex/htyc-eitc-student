package edu.eitc;

public class Main {

    public static void main(String[] args) {
        //Warrior tests
	    Warrior w = new Warrior();
	    System.out.println("Current health: " + w.getHealth());
	    w.attack(1);
        w.attack(2);
        w.rest();
        System.out.println("Current health: " + w.getHealth());

        //Archer tests
        Archer a = new Archer();
        System.out.println("Current health: " + a.getHealth());
        a.attack(1);
        a.attack(2);
        a.attack(4);

        //Berserker tests
        Berserker b = new Berserker();
        System.out.println("Current health: " + b.getHealth());
        b.attack(1);
        b.attack(2);
        b.rage();
        b.attack(1);
        System.out.println("Current health: " + b.getHealth());
        b.rest();
        System.out.println("Current health: " + b.getHealth());

        //Test for units
        Unit uw = new Warrior();
        Unit ua = new Archer();
        Unit ub = new Berserker();
        uw.attack(2);
        ua.attack(2);
        ub.attack(2);

        //Error
//        Unit u = new Unit();
//        Unit uw = new Warrior();
//        uw.rest();
    }
}
