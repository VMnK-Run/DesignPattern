package Homework03.AbstractFactory.factory;

public abstract class Factory {
    public abstract Statement createStatement();
    public abstract Connection createConnection();
}
