package Homework03.Strategy;

public class PostCopy implements Copy{
    @Override
    public void copyMethod() {
        System.out.println("执行后拷贝算法");
    }
}
