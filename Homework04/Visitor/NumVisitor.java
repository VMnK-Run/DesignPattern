package Homework04.Visitor;

public class NumVisitor extends Visitor{
    @Override
    public void visit(Codes codes) {
        System.out.println("源代码中类的个数为:" + codes.getClasses().size());
    }

    @Override
    public void visit(Clazz clazz) {
        System.out.println(clazz.getName() + "类中的属性个数为:" + clazz.getAttributes().size());
        System.out.println(clazz.getName() + "类中方法的个数为:"+clazz.getMethods().size());
    }

    @Override
    public void visit(Method method) {
        System.out.println(method.getName() + "方法的个数为:"+1);
    }

    @Override
    public void visit(Attribute attribute) {
        System.out.println(attribute.getName() + "属性的个数为:" + 1);
    }
}
