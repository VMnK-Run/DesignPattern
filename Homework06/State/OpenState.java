package Homework06.State;

public class OpenState extends State{
    private static OpenState singleton = new OpenState();

    private OpenState() {

    }

    public static OpenState getInstance() {
        return singleton;
    }

    @Override
    public void open(TCP tcp) {
        System.out.println("TCP连接已经开启");
    }

    @Override
    public void listen(TCP tcp) {
        System.out.println("开启TCP监听！");
        tcp.changeState(ListenState.getInstance());
    }

    @Override
    public void close(TCP tcp) {
        System.out.println("关闭TCP连接！");
        tcp.changeState(CloseState.getInstance());
    }
}
