package Homework03.SimpleFactory;

public class SimpleFactory {
    public static Shape createShape(String name) throws UnsupportedShapeException {
        if (name.equals("Circle")) {
            return new Circle("Circle");
        } else if (name.equals("Rectangle")) {
            return new Rectangle("Rectangle");
        } else if (name.equals("Triangle")) {
            return new Triangle("Triangle");
        } else {
            throw new UnsupportedShapeException("不支持的类型！" + name);
        }
    }
}
