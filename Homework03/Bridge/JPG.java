package Homework03.Bridge;

public class JPG extends Image{

    @Override
    public void filter() {
        System.out.println("========JPG格式处理开始========");
        super.filter();
        System.out.println("========JPG格式处理结束========");
    }
}
