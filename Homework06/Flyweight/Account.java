package Homework06.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private List<String> permissions;
    public Account(String name) {
        this.name = name;
        this.permissions = new ArrayList<>();
    }

    public void addPermission(String code) {
        this.permissions.add(code);
    }

    public void showPermissions() {
        System.out.println("用户" + this.name + "拥有以下模块的权限：");
        for (String code : this.permissions) {
            BusinessFactory businessFactory = BusinessFactory.getInstance();
            System.out.println(businessFactory.getBusiness(code).getName());
        }
    }
}
