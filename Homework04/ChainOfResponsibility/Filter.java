package Homework04.ChainOfResponsibility;

public abstract class Filter {
    protected Filter next;

    public Filter setNext(Filter next) {
        this.next = next;
        return next;
    }

    public void process(String message) {
        if (this.next != null) {
            this.next.process(message);
        }
    }
}
