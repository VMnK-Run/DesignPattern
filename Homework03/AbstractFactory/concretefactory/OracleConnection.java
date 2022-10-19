package Homework03.AbstractFactory.concretefactory;

import Homework03.AbstractFactory.factory.Connection;

public class OracleConnection extends Connection {
    public OracleConnection() {
        System.out.println("创建Oracle Connection");
    }
}
