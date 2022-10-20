package Homework04.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Clazz extends Element{

    private List<Attribute> attributes;
    private List<Method> methods;

    public Clazz(String name) {
        this.name = name;
        this.attributes = new ArrayList<Attribute>();
        this.methods = new ArrayList<Method>();
    }

    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }

    public void addMethod(Method method) {
        this.methods.add(method);
    }

    public List<Attribute> getAttributes() {
        return this.attributes;
    }

    public List<Method> getMethods() {
        return this.methods;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
