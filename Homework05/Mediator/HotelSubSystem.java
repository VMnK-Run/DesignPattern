package Homework05.Mediator;

public class HotelSubSystem extends SubSystem{


    public HotelSubSystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receive(SubSystem subSystem ,String message) {
        System.out.println("酒店子系统" + this.name + "收到来自" + subSystem.getName() + "的信息:" + message);
    }
}
