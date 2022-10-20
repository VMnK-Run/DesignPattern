package Homework04.Composite;

public class Test {
    public static void main(String[] args) {
        Group group1 = new Group("group1");
        group1.add(new Member("Jack"));
        group1.add(new Member("Jason"));
        Group group2 = new Group("group2");
        group1.add(group2);
        group2.add(new Member("Marry"));
        group2.add(new Member("Smith"));
        Member newMember = new Member("Tom");
        group2.add(newMember);
        newMember.send("只发给Tom");
        System.out.println("=====发送结束=====");
        group2.send("发给group2的成员");
        System.out.println("=====发送结束=====");
        group1.send("发给所有成员");
    }
}
