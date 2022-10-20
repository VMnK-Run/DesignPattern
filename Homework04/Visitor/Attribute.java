package Homework04.Visitor;

public class Attribute extends Element{

    public Attribute(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
