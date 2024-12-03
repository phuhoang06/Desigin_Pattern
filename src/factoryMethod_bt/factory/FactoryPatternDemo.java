package factoryMethod_bt.factory;

import factoryMethod_bt.model.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Khởi tạo các factory
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        // Sử dụng factory để tạo hình
        Shape circle = circleFactory.getShape();
        circle.draw();  // Output: Drawing a Circle

        Shape rectangle = rectangleFactory.getShape();
        rectangle.draw();  // Output: Drawing a Rectangle

        Shape square = squareFactory.getShape();
        square.draw();  // Output: Drawing a Square
    }
}
