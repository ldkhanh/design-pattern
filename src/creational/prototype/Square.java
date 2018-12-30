package creational.prototype;

import creational.factory.ShapeType;

public class Square extends Shape {
    public Square() {
        type = ShapeType.SQUARE;
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
