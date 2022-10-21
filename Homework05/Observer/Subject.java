package Homework05.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public abstract void notifyObservers();
}
