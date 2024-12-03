package factoryMethod_bt.factory;

import factoryMethod_bt.model.Circle;
import factoryMethod_bt.model.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();  // Trả về đối tượng Circle
    }
}
