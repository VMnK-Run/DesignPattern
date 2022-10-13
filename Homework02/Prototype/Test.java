package Homework02.Prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型模式测试");
        Manager manager = new Manager();
        Picture originalPicture = new Picture();
        ResumeTemplate template = new ResumeTemplate("jack", originalPicture);
        manager.registerTemplate("template1", template);

        ResumeTemplate template1 = manager.create("template1", 0);
        if(template.getPicture() == template1.getPicture()) {
            System.out.println("浅拷贝成功！");
        } else {
            System.out.println("浅拷贝失败！");
        }
        ResumeTemplate template2 = manager.create("template1", 1);
        if (template.getPicture() != template2.getPicture()) {
            System.out.println("深拷贝成功！");
        } else {
            System.out.println("深拷贝失败！");
        }
    }
}
