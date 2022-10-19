package Homework03.SimpleFactory;

public abstract class Shape {
    public Shape(String name) {
        System.out.println("创建" + name + "成功");
    }
    public abstract void draw();
    public abstract void erase();

}
