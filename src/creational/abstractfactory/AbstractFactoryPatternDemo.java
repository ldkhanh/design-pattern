package creational.abstractfactory;

import creational.factory.Shape;
import creational.factory.ShapeType;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstactFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        AbstactFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
        Shape sh1 = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape sh2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape sh3 = shapeFactory.getShape(ShapeType.SQUARE);
        Color col1 = colorFactory.getColor(ColorType.RED);
        Color col2 = colorFactory.getColor(ColorType.GREEN);
        Color col3 = colorFactory.getColor(ColorType.BLUE);
        sh1.draw();
        sh2.draw();
        sh3.draw();
        col1.fill();
        col2.fill();
        col3.fill();
    }
}
