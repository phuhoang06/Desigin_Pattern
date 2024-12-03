package factoryMethod_bt.factory;

import factoryMethod_bt.model.Rectangle;
import factoryMethod_bt.model.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();  // Trả về đối tượng Rectangle
    }
}

