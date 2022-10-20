package Homework04.Visitor;

public abstract class Visitor {
    public abstract void visit(Codes codes);
    public abstract void visit(Clazz clazz);
    public abstract void visit(Method method);
    public abstract void visit(Attribute attribute);
}
