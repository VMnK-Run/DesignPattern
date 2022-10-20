package Homework04.Decorator;

public class HeadDecorator extends Decorator{

    public HeadDecorator(Component component, String decorate) {
        super(component, decorate);
        this.content = decorate + "\n" + component.getContent();
    }
}
