package Homework03.Strategy;

public class Test {
    public static void main(String[] args) {
        System.out.println("Strategy模式测试");
        Cloud cloud = new Cloud();
        cloud.setCopy(new PreCopy());
        cloud.copy();
        cloud.setCopy(new PostCopy());
        cloud.copy();
        cloud.setCopy(new CRMotion());
        cloud.copy();
    }
}
