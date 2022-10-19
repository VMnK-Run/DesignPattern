package Homework03.AbstractFactory.concretefactory;

import Homework03.AbstractFactory.factory.Connection;
import Homework03.AbstractFactory.factory.Factory;
import Homework03.AbstractFactory.factory.Statement;

public class OracleFactory extends Factory {
    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }
}
