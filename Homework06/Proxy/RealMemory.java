package Homework06.Proxy;

import java.util.HashMap;
import java.util.Map;

public class RealMemory extends Memory{
    private Map<String, String> messages;

    public RealMemory() {
        this.messages = new HashMap<String, String>();
    }

    public void addItem(String key, String value) {
        this.messages.put(key, value);
    }

    @Override
    public String getItem(String key) {
        return messages.get(key);
    }
}
