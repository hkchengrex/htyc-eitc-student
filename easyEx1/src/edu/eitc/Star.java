package edu.eitc;

public abstract class Star {
    boolean poked = false;

    void poke(){
        poked = true;
    }

    abstract String getColor();
}
