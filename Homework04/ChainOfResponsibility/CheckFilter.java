package Homework04.ChainOfResponsibility;

public class CheckFilter extends Filter{

    @Override
    public void process(String message) {
        System.out.println("对" + message + "进行数据校验过滤");
        super.process(message);
    }
}
