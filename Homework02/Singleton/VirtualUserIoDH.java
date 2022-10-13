package Homework02.Singleton;

// 使用IoDH
public class VirtualUserIoDH {
    private VirtualUserIoDH() {}

    private static class HolderClass {
        private final static VirtualUserIoDH instance = new VirtualUserIoDH();
    }

    public static VirtualUserIoDH getInstance() {
        return HolderClass.instance;
    }
}
