package creational.abstractfactory;

import creational.factory.*;

public class ShapeFactory extends AbstactFactory {
    @Override
    Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    Shape getShape(ShapeType shapeType) {
        if (shapeType == null) return null;
        if (shapeType == ShapeType.CIRCLE) return new Circle();
        else if (shapeType == ShapeType.RECTANGLE) return new Rectangle();
        else if (shapeType == ShapeType.SQUARE) return new Square();
        return null;
    }
}
