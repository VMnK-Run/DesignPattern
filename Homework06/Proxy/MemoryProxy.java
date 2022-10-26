package Homework06.Proxy;

import java.util.HashMap;
import java.util.Map;

public class MemoryProxy extends Memory{
    private Map<String, String> cache;
    private RealMemory memory;

    public MemoryProxy(RealMemory memory) {
        this.memory = memory;
        this.cache = new HashMap<>();
    }

    @Override
    public String getItem(String key) {
        if(!this.cache.containsKey(key)) {
            System.out.print("从内存中获取数据:\t");
            this.cache.put(key, memory.getItem(key));
        } else {
            System.out.print("从缓冲代理中获取数据:\t");
        }
        return this.cache.get(key);
    }
}
