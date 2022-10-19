package Homework03.AbstractFactory.concretefactory;

import Homework03.AbstractFactory.factory.Statement;

public class OracleStatement extends Statement {
    public OracleStatement() {
        System.out.println("创建Oracle Statement");
    }
}
