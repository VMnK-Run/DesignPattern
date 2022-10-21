package Homework05.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimesObserver extends Observer{

    @Override
    public void update(String message) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = message.split(" ");
        for(String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
