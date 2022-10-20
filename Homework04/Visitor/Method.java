package Homework04.Visitor;

public class Method extends Element{
    private Integer lines;
    public Method(String name, Integer lines) {
        this.name = name;
        this.lines = lines;
    }

    public Integer getLine() {
        return this.lines;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
