package Homework05.Observer;

public class NumObserver extends Observer{
    @Override
    public void update(String message) {
        String[] words = message.split(" ");
        int wordNum = words.length;
        int charNum = 0;
        for(String word : words) {
            charNum += word.length();
        }
        System.out.println("单词总数:" + wordNum);
        System.out.println("字符总数:" + charNum);
    }
}
