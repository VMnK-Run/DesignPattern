package Homework05.Memento;

import java.util.Stack;

public class NoteCaretaker {
    private Stack<Memento> undoMementos = new Stack<>();
    private Stack<Memento> redoMementos = new Stack<>();
    private Memento curMemento;

    public void undo(Note note) {
        redoMementos.push(curMemento);
        Memento memento = undoMementos.pop();
        this.curMemento = memento;
        note.restoreMemento(memento);
    }

    public void redo(Note note) {
        undoMementos.push(curMemento);
        Memento memento = redoMementos.pop();
        this.curMemento = memento;
        note.restoreMemento(memento);
    }

    public void saveNewEdit(Note note) {
        undoMementos.push(curMemento);
        this.curMemento = note.createMemento();
        redoMementos.clear();
    }
}
