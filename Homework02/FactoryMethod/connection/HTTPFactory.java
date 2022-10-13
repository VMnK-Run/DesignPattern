package Homework02.FactoryMethod.connection;

import Homework02.FactoryMethod.framework.Connection;
import Homework02.FactoryMethod.framework.Factory;

public class HTTPFactory extends Factory {
    @Override
    public Connection createConnection() {
        return new HTTP();
    }
}
