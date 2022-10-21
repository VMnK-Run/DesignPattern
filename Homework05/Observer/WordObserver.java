package Homework05.Observer;

import java.util.*;

public class WordObserver extends Observer{
    @Override
    public void update(String message) {
        String[] words = message.split(" ");
        Set<String> wordSet = new HashSet<>(List.of(words));
        List<String> wordList = new ArrayList<>(wordSet);
        wordList.sort((String::compareToIgnoreCase));
        for(String word : wordList) {
            System.out.println("出现的单词：" + word);
        }
    }
}
