package Homework04.ChainOfResponsibility;

public class Test {

    public static void main(String[] args) {
        System.out.println("Chain Of Responsibility模式测试");
        Filter dataTypeFilter = new DataTypeFilter();
        Filter encodeFilter = new EncodeFilter();
        Filter checkFilter = new CheckFilter();
        dataTypeFilter.setNext(encodeFilter).setNext(checkFilter);
        dataTypeFilter.process("abc");
    }
}
