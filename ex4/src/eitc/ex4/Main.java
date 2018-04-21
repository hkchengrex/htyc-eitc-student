package eitc.ex4;

public class Main {

    public static void main(String[] args) {
          Square square = new Square(2,2);
          System.out.println(square.getArea());
          Triangle triangle = new Triangle(2,2 , 3);
          System.out.println(triangle.getArea());
          Shape shape = new Shape(3);
          System.out.println(shape.getArea());
    }
}
