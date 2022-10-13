package Homework02.Singleton;

// 双重检测锁
public class VirtualUserSyn {
    private static volatile VirtualUserSyn vu;
    private VirtualUserSyn() {

    }

    public static VirtualUserSyn getInstance() {
        // 第一重判断
        if(vu == null) {
            // 信号量锁定
            synchronized (VirtualUser.class) {
                // 第二重判断
                if (vu == null) {
                    vu = new VirtualUserSyn();
                }
            }
        }
        return vu;
    }
}
