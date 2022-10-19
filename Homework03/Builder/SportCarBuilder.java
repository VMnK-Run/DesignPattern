package Homework03.Builder;

public class SportCarBuilder extends Builder{
    @Override
    public void makeBody() {
        this.car.setBody("SportCarBody");
        System.out.println("建造运动汽车的车身");
    }

    @Override
    public void makeEngine() {
        this.car.setEngine("SportCarEngine");
        System.out.println("建造运动汽车的发动机");
    }

    @Override
    public void makeTyre() {
        this.car.setTyre("SportCarTyre");
        System.out.println("建造运动汽车的轮胎");
    }

    @Override
    public void makeGearbox() {
        this.car.setGearbox("SportCarGearBox");
        System.out.println("建造运动汽车的变速箱");
    }
}
