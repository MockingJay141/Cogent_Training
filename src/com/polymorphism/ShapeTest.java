package com.polymorphism;

public class ShapeTest {

    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        square.area();
        rectangle.area();
        triangle.area();
    }
}
