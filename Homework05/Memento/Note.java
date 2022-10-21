package Homework05.Memento;

public class Note {
    private String contents;

    public Memento createMemento() {
        return new Memento(this.contents);
    }

    public void restoreMemento(Memento memento) {
        this.contents = memento.getContents();
    }

    public void edit(String contents) {
        this.contents = contents;
    }

    public void display() {
        System.out.println(this.contents);
    }
}
