package Homework04.Decorator;

public abstract class Component {
    protected String content;

    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void display() {
        System.out.println(this.content);
    }
}
