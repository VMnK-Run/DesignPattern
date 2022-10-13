package Homework02.Singleton;

// 饿汉式单例
public class VirtualUser {
    private static VirtualUser vu = new VirtualUser();
    private VirtualUser() {

    }

    public static VirtualUser getInstance() {
        if(vu == null) {
            vu = new VirtualUser();
        }
        return vu;
    }
}
