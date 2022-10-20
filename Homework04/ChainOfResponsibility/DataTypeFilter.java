package Homework04.ChainOfResponsibility;

public class DataTypeFilter extends Filter {

    @Override
    public void process(String message) {
        System.out.println("对" + message + "进行数据类型转换");
        super.process(message);
    }
}
