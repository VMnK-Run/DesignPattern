package Homework04.Visitor;

public class NameVisitor extends Visitor{
    @Override
    public void visit(Codes codes) {
        System.out.println("源码中的类有:");
        for(Clazz clazz : codes.getClasses()) {
            System.out.println(clazz.getName());
        }
    }

    @Override
    public void visit(Clazz clazz) {
        System.out.println(clazz.getName() + "中的属性有:");
        for(Attribute attribute : clazz.getAttributes()) {
            this.visit(attribute);
        }
        System.out.println(clazz.getName() + "中的方法有:");
        for(Method method : clazz.getMethods()) {
            this.visit(method);
        }
    }

    @Override
    public void visit(Method method) {
        System.out.println("\t" + method.getName() + "()");
    }

    @Override
    public void visit(Attribute attribute) {
        System.out.println("\t" + attribute.getName());
    }
}
