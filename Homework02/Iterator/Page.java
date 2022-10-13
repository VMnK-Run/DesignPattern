package Homework02.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Page implements Aggregate{
    private List<String> items;

    public Page() {
        this.items = new ArrayList<String>();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public void removeItem(String item) {
        this.items.remove(item);
    }

    public String getItemAt(int index) {
        return this.items.get(index);
    }

    public Integer getLength() {
        return this.items.size();
    }

    @Override
    public Iterator getIterator(int num) {
        return new PageIterator(this, num);
    }
}
