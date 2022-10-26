package Homework06.Flyweight;

import java.util.HashMap;

public class BusinessFactory {
    private HashMap<String, Business> pool = new HashMap<String, Business>();
    private static BusinessFactory businessFactory = new BusinessFactory();

    private BusinessFactory(){

    }

    public static BusinessFactory getInstance() {
        return businessFactory;
    }

    public synchronized Business getBusiness(String code) {
        return pool.get(code);
    }

    public void addBusiness(String code, Business business) {
        if (!this.pool.containsKey(code)) {
            this.pool.put(code, business);
        }
    }
}
