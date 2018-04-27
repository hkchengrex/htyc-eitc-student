package eitc.ex4;

public class Square extends Shape {

    private double height;

    public Square(double height , double scale) {
        super(scale);
        this.height = height;
    }
    @Override
    public double getArea(){
        return height*height*scale;
    }
}
