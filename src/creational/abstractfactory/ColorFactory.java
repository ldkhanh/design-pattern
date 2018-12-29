package creational.abstractfactory;

import creational.factory.Shape;
import creational.factory.ShapeType;

public class ColorFactory extends AbstactFactory {
    @Override
    Color getColor(ColorType colorType) {
        if (colorType == null) return null;
        if (colorType == ColorType.RED) return new Red();
        else if (colorType == ColorType.GREEN) return new Green();
        else if (colorType == ColorType.BLUE) return new Blue();
        return null;
    }

    @Override
    Shape getShape(ShapeType shapeType) {
        return null;
    }
}
