package Homework02.Iterator;

public class Test {
    public static void main(String[] args) {
        System.out.println("Iterator模式测试");
        Page page = new Page();
        page.addItem("first");
        page.addItem("second");
        page.addItem("third");
        page.addItem("fourth");
        page.addItem("fifth");
        page.addItem("sixth");
        page.addItem("seventh");
        page.addItem("eighth");
        page.addItem("ninth");
        page.addItem("end");
        Iterator it = page.getIterator(3);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
