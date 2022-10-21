package Homework05.Observer;

public class Editor extends Subject{
    private String message;

    public void setMessage(String message) {
        this.message = message;
        this.notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update(this.message);
        }
    }
}
