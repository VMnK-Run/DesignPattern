package Homework06.Proxy;

public class Test {
    public static void main(String[] args) {
        System.out.println("Proxy模式测试");
        RealMemory memory = new RealMemory();
        memory.addItem("01", "1号信息");
        memory.addItem("02", "2号信息");
        memory.addItem("03", "3号信息");
        MemoryProxy memoryProxy = new MemoryProxy(memory);
        System.out.println(memoryProxy.getItem("01"));
        System.out.println(memoryProxy.getItem("02"));
        System.out.println(memoryProxy.getItem("01"));
    }
}
