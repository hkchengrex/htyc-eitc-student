package edu.eitc;

public abstract class Unit {
    protected int health;
    private int attackRange;

    Unit(int health, int attackRange){
        this.health = health;
        this.attackRange = attackRange;
    }

    protected boolean withinAttackRange(int range){
        return range <= attackRange;
    }

    public int getHealth(){
        return health;
    }

    abstract void attack(int range);
}
