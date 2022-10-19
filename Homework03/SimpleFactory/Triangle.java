package Homework03.SimpleFactory;

public class Triangle extends Shape{

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("绘制Triangle");
    }

    @Override
    public void erase() {
        System.out.println("擦除Triangle");
    }
}
