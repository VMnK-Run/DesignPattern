package Homework06.Flyweight;

public class Test {
    public static void main(String[] args) {
        System.out.println("Flyweight模式测试");
        BusinessFactory businessFactory = BusinessFactory.getInstance();
        businessFactory.addBusiness("01", new Business("财务模块"));
        businessFactory.addBusiness("02", new Business("人事模块"));
        businessFactory.addBusiness("03", new Business("后勤模块"));
        businessFactory.addBusiness("04", new Business("考勤模块"));

        Account account1 = new Account("张三");
        account1.addPermission("02");
        account1.addPermission("03");
        account1.addPermission("04");
        account1.showPermissions();

        Account account2 = new Account("李四");
        account2.addPermission("01");
        account2.addPermission("02");
        account2.showPermissions();
    }
}
