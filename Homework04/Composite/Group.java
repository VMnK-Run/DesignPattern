package Homework04.Composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends Entry{
    private List<Entry> list;

    public Group(String name) {
        super(name);
        this.list = new ArrayList<Entry>();
    }

    @Override
    public void add(Entry entry) {
        this.list.add(entry);
    }

    @Override
    public void send(String message) {
        this.receive(message);
        for (Entry entry : list) {
            entry.send(message);
        }
    }

    @Override
    public void receive(String message) {
        System.out.println("Group " + this.name + " receive " + message);
    }
}
