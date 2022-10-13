package Homework02.FactoryMethod;

import Homework02.FactoryMethod.connection.HTTPFactory;
import Homework02.FactoryMethod.connection.IMAPFactory;
import Homework02.FactoryMethod.connection.POP3Factory;
import Homework02.FactoryMethod.framework.Connection;

public class Test {
    public static void main(String[] args) {
        HTTPFactory httpFactory = new HTTPFactory();
        Connection conn1 = httpFactory.createConnection();

        IMAPFactory imapFactory = new IMAPFactory();
        Connection conn2 = imapFactory.createConnection();

        POP3Factory pop3Factory = new POP3Factory();
        Connection conn3 = pop3Factory.createConnection();
    }
}
