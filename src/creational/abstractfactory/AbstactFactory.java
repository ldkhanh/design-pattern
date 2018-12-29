package creational.abstractfactory;

import creational.factory.Shape;
import creational.factory.ShapeType;

public abstract class AbstactFactory {
    abstract Color getColor(ColorType colorType);
    abstract Shape getShape(ShapeType shapeType);
}
