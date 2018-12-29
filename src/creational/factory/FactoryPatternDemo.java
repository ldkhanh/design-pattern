package creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.get(ShapeType.CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.get(ShapeType.RECTANGLE);
        shape2.draw();
        Shape shape3 = shapeFactory.get(ShapeType.SQUARE);
        shape3.draw();
    }
}
