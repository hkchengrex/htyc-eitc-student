package edu.eitc;

public class GoodStar extends Star{
    String getColor(){
        if (poked){
            return "Blue";
        }else{
            return "White";
        }
    }
}
