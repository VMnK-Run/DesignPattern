package Homework03.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("SimpleFactory模式测试");
            Shape circle = SimpleFactory.createShape("Circle");
            Shape triangle = SimpleFactory.createShape("Triangle");
            Shape rectangle = SimpleFactory.createShape("Rectangle");
            circle.draw();
            circle.erase();
            Shape ball = SimpleFactory.createShape("ball");
        } catch (UnsupportedShapeException e) {
            throw new RuntimeException(e);
        }
    }
}
