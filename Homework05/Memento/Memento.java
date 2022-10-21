package Homework05.Memento;

public class Memento {
    private String contents;

    Memento(String contents) {
        this.contents = contents;
    }

    void setContents(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return this.contents;
    }
}
