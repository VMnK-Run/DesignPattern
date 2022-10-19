package Homework03.Builder;

public class Test {
    public static void main(String[] args) {
        System.out.println("Builder模式测试");
        Builder sportCarBuilder = new SportCarBuilder();
        Director director = new Director(sportCarBuilder);
        Car sportCar = director.construct();
        System.out.println(sportCar);
    }
}
