package Homework05.Observer;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor();
        NumObserver numObserver = new NumObserver();
        WordObserver wordObserver = new WordObserver();
        TimesObserver timesObserver = new TimesObserver();
        editor.addObserver(numObserver);
        editor.addObserver(wordObserver);
        editor.addObserver(timesObserver);
        editor.setMessage("I Love TJU and I am a student in College of Intelligence and Computing");
    }
}
