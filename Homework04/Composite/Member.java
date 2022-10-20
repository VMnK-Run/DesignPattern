package Homework04.Composite;

public class Member extends Entry{
    public Member(String name) {
        super(name);
    }

    @Override
    public void add(Entry entry) {
        throw new RuntimeException("无法向成员添加！");
    }

    @Override
    public void send(String message) {
        this.receive(message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Member " + this.name + " receive " + message);
    }
}
