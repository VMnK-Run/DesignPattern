package Homework05.Memento;

public class Test {
    public static void main(String[] args) {
        Note note = new Note();
        NoteCaretaker noteCaretaker = new NoteCaretaker();
        note.edit("第一句话");
        noteCaretaker.saveNewEdit(note);
        note.edit("第二句话");
        noteCaretaker.saveNewEdit(note);
        note.edit("第三句话");
        noteCaretaker.saveNewEdit(note);
        note.display();
        noteCaretaker.undo(note);
        note.display();
        noteCaretaker.undo(note);
        note.display();
        noteCaretaker.redo(note);
        note.display();
        noteCaretaker.redo(note);
        note.display();
    }
}
