package Homework06.State;

public class Test {
    public static void main(String[] args) {
        System.out.println("State模式测试");
        TCP tcp = new TCP();
        tcp.open();
        tcp.listen();
        tcp.close();
    }
}
