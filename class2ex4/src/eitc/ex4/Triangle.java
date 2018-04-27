package eitc.ex4;

public class Triangle extends Shape {

    private double height;
    private double width;

    public Triangle(double height, double width , double scale){
           super(scale);
           this.height = height;
           this.width = width;
    }
    @Override
    public double getArea(){
        return (height*width/2)*scale;
    }
}
