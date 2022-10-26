package Homework06.State;

public class CloseState extends State{
    private static CloseState singleton = new CloseState();

    private CloseState() {

    }

    public static CloseState getInstance() {
        return singleton;
    }

    @Override
    public void open(TCP tcp) {
        System.out.println("建立TCP连接！");
        tcp.changeState(OpenState.getInstance());
    }

    @Override
    public void listen(TCP tcp) {
        System.out.println("无法开启监听！");
    }

    @Override
    public void close(TCP tcp) {
        System.out.println("TCP连接已经关闭");
    }
}
