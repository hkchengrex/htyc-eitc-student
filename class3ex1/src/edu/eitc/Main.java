package edu.eitc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> univserities = new ArrayList<>();
        univserities.add("The University of Hong Kong");
        univserities.add("The Chinese University of Hong Kong");
        univserities.add("The Hong Kong University of Science and Technology");
        univserities.add("City University of Hong Kong");
        univserities.add("The Hong Kong Polytechnic University");
        univserities.add("Hong Kong Baptist University");
        univserities.add("Lingnan University");
        univserities.add("The Education University of Hong Kong");
        System.out.println(univserities.size());
        univserities.set(2,"The Hong Kong University of Shaolin Temple");
        for (int i=0;i<univserities.size();i++){
            System.out.println(univserities.get(i));
        }
        univserities.add("Hong Kong Tree University");
        System.out.println(univserities.size());
    }
}
