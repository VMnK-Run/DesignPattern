package Homework04.Decorator;

public class Test {
    public static void main(String[] args) {
        Table table = new Table("原始报表内容");
        table.display();
        System.out.println();
        Decorator headTable = new HeadDecorator(table, "#######");
        Decorator footTable = new FootDecorator(headTable, "======");
        footTable.display();
    }
}
