package Homework03.SimpleFactory;

public class Rectangle extends Shape{
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("绘制Rectangle");
    }

    @Override
    public void erase() {
        System.out.println("擦除Rectangle");
    }
}
