package creational.abstractfactory;

public class FactoryProducer {
    public static AbstactFactory getFactory(FactoryType type) {
        if (type == FactoryType.COLOR) return new ColorFactory();
        else if (type == FactoryType.SHAPE) return new ShapeFactory();
        return null;
    }
}
