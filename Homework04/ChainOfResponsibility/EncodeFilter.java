package Homework04.ChainOfResponsibility;

public class EncodeFilter extends Filter{

    @Override
    public void process(String message) {
        System.out.println("对" + message + "进行字符编码过滤");
        super.process(message);
    }
}
