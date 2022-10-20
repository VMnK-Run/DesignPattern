package Homework04.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Codes extends Element{
    private List<Clazz> classes;

    public Codes() {
        this.classes = new ArrayList<>();
    }

    public void addClass(Clazz clazz) {
        this.classes.add(clazz);
    }

    public List<Clazz> getClasses() {
        return this.classes;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
