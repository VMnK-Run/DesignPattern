package Homework03.SimpleFactory;

public class Circle extends Shape{

    public Circle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("绘制Circle");
    }

    @Override
    public void erase() {
        System.out.println("擦除Circle");
    }
}
