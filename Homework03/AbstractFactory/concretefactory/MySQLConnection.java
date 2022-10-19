package Homework03.AbstractFactory.concretefactory;

import Homework03.AbstractFactory.factory.Connection;

public class MySQLConnection extends Connection {
    public MySQLConnection() {
        System.out.println("创建MySQL Connection");
    }
}
