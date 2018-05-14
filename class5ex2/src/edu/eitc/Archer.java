package edu.eitc;

public class Archer extends Unit{

    Archer(){
        super(80, 3);
    }

    @Override
    void attack(int range){
        if (withinAttackRange(range)) {
            System.out.println("An arrow was shot and hit its target!");
        }else{
            System.out.println("The arrow could not reach its target!");
        }
    }
}
