package Homework03.Bridge;

public class Blur implements Filter{

    @Override
    public void filter() {
        System.out.println("模糊滤镜处理");
    }
}
