package Homework03.Strategy;

public class PreCopy implements Copy{
    @Override
    public void copyMethod() {
        System.out.println("执行预拷贝算法");
    }
}
