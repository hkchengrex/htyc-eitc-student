package edu.eitc;

import java.util.ArrayList;

public class Main {

    static void printContent(ArrayList<String> arrayList){
        for (String s : arrayList) {
            System.out.println(s);
        }
//        for (int i=0; i<arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        System.out.println();
    }

    static void removeAll(ArrayList<String> arrayList, String target){
        while(arrayList.contains(target)) {
            arrayList.remove(target);
        }
    }

    public static void main(String[] args) {
	    ArrayList<String> animalList = new ArrayList<>();

        animalList.add("cat");
        animalList.add("cat");
	    animalList.add("dog");
        animalList.add("elephant");
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("elephant");

        printContent(animalList);
        removeAll(animalList, "cat");
        printContent(animalList);
        removeAll(animalList, "elephant");
        printContent(animalList);
        removeAll(animalList, "dog");

        System.out.println(animalList.size());
    }
}
