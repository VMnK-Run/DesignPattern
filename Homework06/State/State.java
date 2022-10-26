package Homework06.State;

public abstract class State {
    public abstract void open(TCP tcp);
    public abstract void listen(TCP tcp);
    public abstract void close(TCP tcp);
}
