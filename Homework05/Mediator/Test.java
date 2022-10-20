package Homework05.Mediator;

public class Test {
    public static void main(String[] args) {
        System.out.println("Mediator模式测试");
        Mediator mediator = new ConcreteMediator();
        SubSystem airportSubSystem = new AirportSubSystem("1号机场", mediator);
        SubSystem hotelSubSystem = new HotelSubSystem("1号酒店", mediator);
        SubSystem ravelSubSystem = new RavelSubSystem("1号旅行社", mediator);
        SubSystem restSubSystem = new RavelSubSystem("1号餐厅", mediator);
        SubSystem tourismSubSystem = new TourismSubSystem("1号景点", mediator);

        airportSubSystem.send("机场来客人了");
    }
}
