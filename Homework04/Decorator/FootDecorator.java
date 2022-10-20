package Homework04.Decorator;

public class FootDecorator extends Decorator{
    public FootDecorator(Component component, String decorate) {
        super(component, decorate);
        this.content = component.getContent() + "\n" + decorate;
    }
}
