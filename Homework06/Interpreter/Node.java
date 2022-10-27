package Homework06.Interpreter;

public abstract class Node {
    public abstract void interpret(Context context) throws ParseException;

    public abstract String execute();
}
