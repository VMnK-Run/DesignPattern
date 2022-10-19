package Homework03.Bridge;

public class BMP extends Image{
    @Override
    public void filter() {
        System.out.println("========BMP格式处理开始========");
        super.filter();
        System.out.println("========BMP格式处理结束========");
    }
}
