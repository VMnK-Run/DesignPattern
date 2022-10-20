package Homework04.Visitor;

public class Test {
    public static void main(String[] args) {
        System.out.println("Visitor模式测试");
        Codes code = new Codes();
        Clazz clazz1 = new Clazz("Apple");
        clazz1.addMethod(new Method("cutApple", 5));
        clazz1.addMethod(new Method("washApple", 4));
        clazz1.addMethod(new Method("buyApple", 6));
        clazz1.addAttribute(new Attribute("price"));
        clazz1.addAttribute(new Attribute("number"));
        Clazz clazz2 = new Clazz("Orange");
        clazz2.addAttribute(new Attribute("color"));
        clazz2.addAttribute(new Attribute("price"));
        clazz2.addAttribute(new Attribute("weight"));
        Method method1 = new Method("buyIt", 10);
        Method method2 = new Method("sellIt", 20);
        clazz2.addMethod(method1);
        clazz2.addMethod(method2);
        code.addClass(clazz1);
        code.addClass(clazz2);
        code.accept(new NumVisitor());
        clazz1.accept(new NumVisitor());
        code.accept(new NameVisitor());
        clazz1.accept(new NameVisitor());
        clazz2.accept(new NameVisitor());
        code.accept(new LineVisitor());
        clazz1.accept(new LineVisitor());
        method2.accept(new LineVisitor());
    }
}
