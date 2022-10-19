package Homework03.Bridge;

public class GIF extends Image{
    @Override
    public void filter() {
        System.out.println("========GIF格式处理开始========");
        super.filter();
        System.out.println("========GIF格式处理结束========");
    }
}
