package Homework03.AbstractFactory.concretefactory;

import Homework03.AbstractFactory.factory.Statement;

public class MySQLStatement extends Statement {
    public MySQLStatement() {
        System.out.println("创建MySQL Statement");
    }
}
