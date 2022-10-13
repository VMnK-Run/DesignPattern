package Homework02.Singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("单例模式测试");
        VirtualUser user1 = VirtualUser.getInstance();
        VirtualUser user2 = VirtualUser.getInstance();
        if(user1 == user2) {
            System.out.println("生成同一个实例，使用饿汉式单例");
        } else {
            System.out.println("不是同一个实例");
        }

        VirtualUserSyn user3 = VirtualUserSyn.getInstance();
        VirtualUserSyn user4 = VirtualUserSyn.getInstance();
        if (user3 == user4) {
            System.out.println("生成同一个实例，使用双重检测锁");
        }

        VirtualUserIoDH user5 = VirtualUserIoDH.getInstance();
        VirtualUserIoDH user6 = VirtualUserIoDH.getInstance();
        if (user5 == user6) {
            System.out.println("生成同一个实例，使用IoDH");
        }

    }
}
