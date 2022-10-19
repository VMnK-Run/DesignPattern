package Homework03.AbstractFactory;

import Homework03.AbstractFactory.concretefactory.MySQLFactory;
import Homework03.AbstractFactory.concretefactory.OracleFactory;
import Homework03.AbstractFactory.factory.Connection;
import Homework03.AbstractFactory.factory.Factory;
import Homework03.AbstractFactory.factory.Statement;

public class Test {
    public static void main(String[] args) {
        System.out.println("AbstractFactory模式测试");
        Factory mysqlFactory = new MySQLFactory();
        Statement mysqlStatement = mysqlFactory.createStatement();
        Connection mysqlConnection = mysqlFactory.createConnection();
        Factory oracleFactory = new OracleFactory();
        Statement oracleStatement = oracleFactory.createStatement();
        Connection oracleConnection = oracleFactory.createConnection();
    }
}
