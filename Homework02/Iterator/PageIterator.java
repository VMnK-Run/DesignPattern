package Homework02.Iterator;

import java.util.ArrayList;
import java.util.List;

public class PageIterator implements Iterator{
    private final Page page;
    private int index; // 当前遍历到的下标
    private final int num; // 每页数量

    public PageIterator(Page page, int num) {
        this.page = page;
        this.index = 0;
        this.num = num;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.page.getLength();
    }

    @Override
    public Object next() {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < num && this.index < this.page.getLength(); i++) {
            res.add(this.page.getItemAt(this.index));
            this.index++;
        }
        return res;
    }
}
