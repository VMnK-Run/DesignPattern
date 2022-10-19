package Homework03.AbstractFactory.concretefactory;

import Homework03.AbstractFactory.factory.Connection;
import Homework03.AbstractFactory.factory.Factory;
import Homework03.AbstractFactory.factory.Statement;

public class MySQLFactory extends Factory {
    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}
