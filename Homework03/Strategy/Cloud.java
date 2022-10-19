package Homework03.Strategy;

public class Cloud {
    private Copy copy;
    public Cloud() {

    }
    public void setCopy(Copy copy) {
        System.out.println();
        this.copy = copy;
    }
    public void copy() {
        this.copy.copyMethod();
    }
}
