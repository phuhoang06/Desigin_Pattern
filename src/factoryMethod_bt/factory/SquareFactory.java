package factoryMethod_bt.factory;

import factoryMethod_bt.model.Shape;
import factoryMethod_bt.model.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Square();  // Trả về đối tượng Square
    }
}

