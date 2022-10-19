package Homework03.Bridge;

public class Cutout implements Filter{

    @Override
    public void filter() {
        System.out.println("木刻滤镜处理");
    }
}
