package Homework06.State;

public class ListenState extends State{
    private static ListenState singleton = new ListenState();

    private ListenState() {

    }

    public static ListenState getInstance() {
        return singleton;
    }


    @Override
    public void open(TCP tcp) {
        System.out.println("TCP连接已经开启");
    }

    @Override
    public void listen(TCP tcp) {
        System.out.println("正在开启监听");
    }

    @Override
    public void close(TCP tcp) {
        System.out.println("关闭TCP连接!");
        tcp.changeState(CloseState.getInstance());
    }
}
