package Homework04.Decorator;

public abstract class Decorator extends Component{
    protected Component component;

    public Decorator(Component component, String decorate) {
        this.component = component;
    }
}
