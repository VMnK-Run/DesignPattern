package Homework03.Bridge;

public class Test {
    public static void main(String[] args) {
        System.out.println("Bridge模式测试");
        Image jpg = new JPG();
        jpg.setImageFilter(new Cutout());
        jpg.filter();
        System.out.println();
        Image gif = new GIF();
        gif.setImageFilter(new Sharpen());
        gif.filter();

    }
}
