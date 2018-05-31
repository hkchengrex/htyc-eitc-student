package edu.eitc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Star> stars = new ArrayList<>();

        Random random = new Random();
        int length = random.nextInt(3) + 3;

        for (int i=0; i<length; i++){
            if (random.nextBoolean()){
                stars.add(new GoodStar());
            }else{
                stars.add(new BadStar());
            }
        }

        System.out.println("Total stars: " + stars.size());

        for (Star s : stars){
            System.out.println(s.getColor());
            s.poke();
        }

        System.out.println("Start poking...");

        for (Star s : stars){
            System.out.println(s.getColor());
        }

        System.out.println("Start killing...");

        stars.removeIf(star -> star.getColor().equals("Blue"));
        for (Star s : stars){
            System.out.println(s.getColor());
        }

        System.out.println("Stars left: " + stars.size());
    }
}
