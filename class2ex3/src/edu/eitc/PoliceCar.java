package edu.eitc;

public class PoliceCar extends PriorityCar{
    final String policeID;
    public PoliceCar(String color, String _policeID){
        super(color);

        policeID =_policeID;
    }

    String getPoliceID(){
        return policeID;
    }
}
