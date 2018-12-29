package creational.factory;

public class ShapeFactory {
    public Shape get(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else { // (shapeType == ShapeType.SQUARE)
            return new Square();
        }
    }
}
